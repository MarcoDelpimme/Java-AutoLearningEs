import java.util.Scanner;

public class Esercizi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Inserisci il lato del quadrato: ");
        // double lato = scanner.nextDouble();
        // double perimetroQuadrato = 4 * lato;
        // System.out.println("Il perimetro del quadrato è: " + perimetroQuadrato);

        // 7
        System.out.print("\nInserisci la lunghezza del rettangolo: ");
        double lunghezza = scanner.nextDouble();
        System.out.print("Inserisci la larghezza del rettangolo: ");
        double larghezza = scanner.nextDouble();
        double areaRettangolo = lunghezza * larghezza;
        double perimetroRettangolo = 2 * (lunghezza + larghezza);
        System.out.println("L'area del rettangolo è: " + areaRettangolo);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);

        // 8
        System.out.print("\nInserisci il numero di anni: ");
        int anni = scanner.nextInt();
        int giorni = anni * 365;
        System.out.println("Il numero approssimativo di giorni è: " + giorni);

        // 9
        System.out.print("\nInserisci la tua età: ");
        int eta = scanner.nextInt();
        if (eta >= 18) {
            System.out.println("Sei maggiorenne.");
        } else {
            System.out.println("Sei minorenne.");
        }
        // 10
        System.out.print("\nInserisci un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }
        // 11
        System.out.print("\nInserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Il numero maggiore è: " + num1);
        } else if (num1 < num2) {
            System.out.println("Il numero maggiore è: " + num2);
        } else {
            System.out.println("I numeri sono uguali.");
        }
        // 12
        System.out.print("\nInserisci il primo numero: ");
        int n1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int n2 = scanner.nextInt();
        System.out.print("Inserisci il terzo numero: ");
        int n3 = scanner.nextInt();
        int minimo = Math.min(n1, Math.min(n2, n3));
        System.out.println("Il numero minimo è: " + minimo);
        // 13
        System.out.print("\nInserisci un numero: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Il numero è positivo.");
        } else if (num < 0) {
            System.out.println("Il numero è negativo.");
        } else {
            System.out.println("Il numero è zero.");
        }
        // 14
        System.out.print("\nInserisci una parola: ");
        String parola = scanner.next();
        if (parola.length() > 5) {
            System.out.println("La parola è lunga più di 5 caratteri.");
        } else {
            System.out.println("La parola è lunga 5 o meno caratteri.");
        }

        scanner.close();
    }
}
