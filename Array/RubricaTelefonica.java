import java.util.Scanner;
import java.util.TreeMap;

public class RubricaTelefonica {
    private TreeMap<String, String> rubrica = new TreeMap<>();

    public void aggiungiContatto() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del contatto: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci il numero di telefono: ");
        String numero = scanner.nextLine();

        rubrica.put(nome, numero);
        System.out.println("Contatto aggiunto con successo!");
    }

    public void stampaContatti() {
        System.out.println("Rubrica telefonica:");
        for (String nome : rubrica.keySet()) {
            System.out.println("Nome: " + nome + " - Numero: " + rubrica.get(nome));
        }
    }

    public void cercaNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci il nome del contatto da cercare: ");
        String nome = scanner.nextLine();

        if (rubrica.containsKey(nome)) {
            System.out.println("Numero di " + nome + ": " + rubrica.get(nome));
        } else {
            System.out.println("Contatto non trovato.");
        }
    }
}
