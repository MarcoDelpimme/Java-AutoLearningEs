public class Variable {

    public static void main(String[] args) {

        // System.out.println("l'area del rettangolo e' " + area(10, 5));
    }

    // public static int area(int altezza, int larghezza) {
    // return altezza * larghezza;
    // }

    // ________________________________________________________________________________
    int altezza;
    int larghezza;

    public int area(int altezza, int larghezza) {
        return altezza * larghezza;
    }

    public int ipotenusa(int altezza, int larghezza, int area) {
        return area / (altezza * larghezza);
    }
    // ________________________________________________________________________________

    public int arrotonda(double value) {
        return (int) (value + 0.5);
    }
    // ____________________________________________________________________________________
}
