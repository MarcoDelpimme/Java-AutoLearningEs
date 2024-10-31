public class Triangolo {

    private int altezza;
    private int larghezza;

    public Triangolo(int altezza, int larghezza) {

        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public void area(int altezza, int larghezza) {
        int area = (altezza * larghezza) / 2;
        System.out.println(area + " e' l'area");
        ;
    }

    // public void stampaIpotenusa() {

    // int ipotenusa = (altezza * larghezza) / area;
    // System.out.println(ipotenusa + " e' l'ipotenusa");
    // }
}
