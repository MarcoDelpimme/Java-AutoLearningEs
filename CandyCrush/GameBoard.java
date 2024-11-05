import java.util.Random;

public class GameBoard {

    public int[][] matrix;
    public int size;
    public int score;

    public GameBoard(int size) {
        this.size = size;
        this.matrix = new int[size][size];
        this.score = 0;
        initialize();
    }

    public void initialize() {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int floodFill(int x, int y, int value) {
        if (x < 0 || x >= size || y < 0 || y >= size)
            return 0;
        if (matrix[x][y] != value)
            return 0;

        matrix[x][y] = 0; // Elimina la cella
        int cellsEliminated = 1;
        cellsEliminated += floodFill(x + 1, y, value);
        cellsEliminated += floodFill(x - 1, y, value);
        cellsEliminated += floodFill(x, y + 1, value);
        cellsEliminated += floodFill(x, y - 1, value);

        return cellsEliminated;
    }

    public void eliminateConnectedCells(int x, int y) {
        int value = matrix[x][y];
        if (value == 0)
            return;
        int cellsEliminated = floodFill(x, y, value);
        int points = cellsEliminated * 5;
        score += points;
        System.out.println("Celle eliminate: " + cellsEliminated);
        System.out.println("Punteggio guadagnato: " + points);

        applyGravity();
    }

    public void applyGravity() {
        Random rand = new Random();
        for (int j = 0; j < size; j++) {
            int emptyCells = size - 1;
            for (int i = size - 1; i >= 0; i--) {
                if (matrix[i][j] != 0) {
                    if (i != emptyCells) {
                        matrix[emptyCells][j] = matrix[i][j];
                        matrix[i][j] = 0;
                    }
                    emptyCells--;
                }
            }

            for (int i = emptyCells; i >= 0; i--) {
                matrix[i][j] = rand.nextInt(9) + 1;
            }
        }
    }

    public void displayMatrixWithDelay(int delay) {
        displayMatrix();
        if (delay > 0) {
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void aiMove() {
        int maxCellsEliminated = 0;
        int bestX = -1, bestY = -1;

        int[][] tempMatrix = new int[size][size];

        for (int x = 0; x < size; x++) {
            System.arraycopy(matrix[x], 0, tempMatrix[x], 0, size);

            for (int y = 0; y < size; y++) {
                if (matrix[x][y] != 0) {
                    int cellsEliminated = floodFill(x, y, matrix[x][y], tempMatrix);
                    if (cellsEliminated > maxCellsEliminated) {
                        maxCellsEliminated = cellsEliminated;
                        bestX = x;
                        bestY = y;
                    }

                    System.arraycopy(matrix[x], 0, tempMatrix[x], 0, size);
                }
            }
        }

        if (bestX != -1 && bestY != -1) {
            System.out.println("IA ha scelto di eliminare la cella (" + bestX + ", " + bestY + ")");
            eliminateConnectedCells(bestX, bestY);
        }
    }

    public int getScore() {
        return score;
    }

    public boolean hasValidMoves() {
        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
                if (matrix[x][y] != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public int floodFill(int x, int y, int value, int[][] tempMatrix) {
        if (x < 0 || x >= size || y < 0 || y >= size)
            return 0;
        if (tempMatrix[x][y] != value)
            return 0;

        tempMatrix[x][y] = 0;
        int cellsEliminated = 1;
        cellsEliminated += floodFill(x + 1, y, value, tempMatrix);
        cellsEliminated += floodFill(x - 1, y, value, tempMatrix);
        cellsEliminated += floodFill(x, y + 1, value, tempMatrix);
        cellsEliminated += floodFill(x, y - 1, value, tempMatrix);

        return cellsEliminated;
    }
}
