public class ElevamentoPotenza {

    public static int potenza(int base, int esponente) {

        if (esponente == 0) {
            return 1;
        } else {
            return base * potenza(base, esponente - 1);
        }
    }

}
