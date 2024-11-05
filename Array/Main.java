import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ex1
        // Spesa spesa = new Spesa();
        // boolean Scelta = true;
        // Scanner scanner = new Scanner(System.in);
        // do {
        // System.out.println("Menu:");
        // System.out.println("1. Aggiungi prodotto");
        // System.out.println("2. Rimuovi prodotto");
        // System.out.println("3. Stampa spesa");
        // System.out.println("4. Esci");
        // int scelta = scanner.nextInt();
        // switch (scelta) {
        // case 1:
        // spesa.addProduct();
        // break;
        // case 2:
        // spesa.deleteProduct();
        // break;
        // case 3:
        // spesa.stampaSpesa();
        // break;
        // case 4:
        // Scelta = false;
        // break;
        // default:
        // System.out.println("Scelta non valida");
        // }
        // } while (Scelta);

        // scanner.close();
        // ________________________________________
        // ex2
        // Price price = new Price();
        // boolean Scelta2 = true;
        // Scanner scanner2 = new Scanner(System.in);
        // do {
        // System.out.println("Menu:");
        // System.out.println("1. Aggiungi prodotto");
        // System.out.println("2. Rimuovi prodotto");
        // System.out.println("3. Stampa spesa");
        // System.out.println("4. Esci");
        // int scelta = scanner2.nextInt();
        // switch (scelta) {
        // case 1:
        // price.addProduct();
        // break;
        // case 2:
        // price.deleteProduct();
        // break;
        // case 3:
        // price.stampaSpesa();
        // break;
        // case 4:
        // Scelta2 = false;
        // break;
        // default:
        // System.out.println("Scelta non valida");
        // }
        // } while (Scelta2);

        // scanner2.close();
        // ________________________________________

        // ex3
        // Treeset treeset = new Treeset();
        // boolean Scelta3 = true;
        // Scanner scanner3 = new Scanner(System.in);
        // do {
        // System.out.println("Menu:");
        // System.out.println("1. Inserisci una città");
        // System.out.println("2. Stampa le città in ordine alfabetico");
        // System.out.println("3. Esci");
        // int scelta = scanner3.nextInt();
        // switch (scelta) {
        // case 1:
        // treeset.addCity();
        // break;
        // case 2:
        // treeset.orderedCities();
        // break;
        // case 3:
        // Scelta3 = false;
        // break;
        // default:
        // System.out.println("Scelta non valida");
        // }
        // } while (Scelta3);

        // scanner3.close();
        // ________________________________________

        // ex4
        // HashSetProgram program = new HashSetProgram();
        // program.addNumbers();
        // program.printNumbers();
        // program.commonNumbers();
        // _________________________________________

        // ex5
        RubricaTelefonica rubricaTelefonica = new RubricaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int scelta;
        do {
            System.out.println("\n--- Rubrica Telefonica ---");
            System.out.println("1. Aggiungi contatto");
            System.out.println("2. Stampa tutti i contatti");
            System.out.println("3. Cerca numero di telefono");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma la nuova linea

            switch (scelta) {
                case 1:
                    rubricaTelefonica.aggiungiContatto();
                    break;
                case 2:
                    rubricaTelefonica.stampaContatti();
                    break;
                case 3:
                    rubricaTelefonica.cercaNumero();
                    break;
                case 4:
                    System.out.println("Uscita dal programma.");
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        } while (scelta != 4);
    }
    // _________________________________________

    // Main gestione = new Main();
    // Scanner scanner = new Scanner(System.in);

    // String continua;
    // do {
    // gestione.aggiungiStudente();
    // System.out.print("Vuoi aggiungere un altro studente? (s/n): ");
    // continua = scanner.nextLine().trim().toLowerCase();
    // } while (continua.equals("s"));

    // gestione.stampaStudenti();

}

// HASHSET

// private HashSet<String> classeA = new HashSet<>();
// private HashSet<String> classeB = new HashSet<>();

// public void aggiungiStudente() {
// Scanner scanner = new Scanner(System.in);

// System.out.print("Inserisci l'identificativo dello studente: ");
// String studente = scanner.nextLine().trim();

// System.out.print("In quale classe vuoi aggiungere lo studente? (A, B,
// entrambe): ");
// String classe = scanner.nextLine().trim().toUpperCase();

// switch (classe) {
// case "A":
// if (!classeA.add(studente)) {
// System.out.println("Lo studente è già presente nella classe A.");
// }
// break;

// case "B":
// if (!classeB.add(studente)) {
// System.out.println("Lo studente è già presente nella classe B.");
// }
// break;

// case "ENTRAMBE":
// boolean aggiuntoInA = classeA.add(studente);
// boolean aggiuntoInB = classeB.add(studente);

// if (!aggiuntoInA && !aggiuntoInB) {
// System.out.println("Lo studente è già presente in entrambe le classi.");
// } else if (!aggiuntoInA) {
// System.out.println("Lo studente è già presente nella classe A.");
// } else if (!aggiuntoInB) {
// System.out.println("Lo studente è già presente nella classe B.");
// }
// break;

// default:
// System.out.println("Scelta non valida. Inserire 'A', 'B' o 'entrambe'.");
// }
// scanner.close();
// }

// public void stampaStudenti() {
// System.out.println("Studenti nella classe A: " + classeA);
// System.out.println("Studenti nella classe B: " + classeB);
// }

// // HASHMAP
// public void addProduct() {
// HashMap<String, Integer> map = new HashMap<String, Integer>();

// Scanner scanner = new Scanner(System.in);
// System.out.println("inserisci nome prodotto");
// String prodotto = scanner.nextLine();
// System.out.println("inserisci quantità");
// Integer quantita = scanner.nextInt();
// map.put(prodotto, quantita);

// for (String prodottoQuantita : map.keySet()) {
// System.out.println(prodottoQuantita + " " + quantita);
// }
// scanner.close();
// };