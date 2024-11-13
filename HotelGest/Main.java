import java.util.Scanner;

public class Main {

    // CONNESSIONE
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto nella gestione di un hotel!");

        System.out.println("Selezionare la funzione che si desidera utilizzare:");

        System.out.println("1. Registra utente");
        System.out.println("2. Elimina utente");
        System.out.println("3. Registra stanza");

        System.out.println("5. Crea allocazione");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Registra utente
                break;
            case 2:
                // Elimina utente
                break;
            case 3:
                // Registra stanza
                break;
            case 4:
                // Crea allocazione
                break;

            default:
                System.out.println("La funzione selezionata non esiste.");
        }

    }
}
