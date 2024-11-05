import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la dimensione della griglia (es. 5 per una griglia 5x5): ");
        int gridSize = scanner.nextInt();

        GameBoard gameBoard = new GameBoard(gridSize);
        System.out.println("Iniziamo a giocare!");
        gameBoard.displayMatrixWithDelay(0);

        while (true) {
            System.out.println("\nInserisci le coordinate della cella da eliminare (x y) oppure 'exit' per uscire:");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Gioco terminato. Punteggio finale: " + gameBoard.getScore());
                break;
            }

            String[] coordinates = input.split(" ");
            if (coordinates.length != 2) {
                System.out.println("Errore: inserisci due numeri separati da uno spazio (formato 'x y').");
                continue;
            }

            if (isInteger(coordinates[0]) && isInteger(coordinates[1])) {
                int x = Integer.parseInt(coordinates[0]);
                int y = Integer.parseInt(coordinates[1]);

                if (x >= 0 && x < gridSize && y >= 0 && y < gridSize) {
                    gameBoard.eliminateConnectedCells(x, y);
                    System.out.println("Griglia aggiornata:");
                    gameBoard.displayMatrixWithDelay(1000);
                    System.out.println("Punteggio attuale: " + gameBoard.getScore());

                    gameBoard.aiMove();
                    System.out.println("Griglia aggiornata dopo l'AI:");
                    gameBoard.displayMatrixWithDelay(1000);
                    System.out.println("Punteggio attuale: " + gameBoard.getScore());

                    if (!gameBoard.hasValidMoves()) {
                        System.out.println("Nessuna mossa valida rimasta. Gioco terminato. Punteggio finale: "
                                + gameBoard.getScore());
                        break;
                    }
                } else {
                    System.out.println("Errore: le coordinate devono essere tra 0 e " + (gridSize - 1) + ".");
                }
            } else {
                System.out.println("Errore: inserisci numeri validi per le coordinate.");
            }
        }

        scanner.close();
    }

    private static boolean isInteger(String str) {
        return str.matches("\\d+");
    }
}
