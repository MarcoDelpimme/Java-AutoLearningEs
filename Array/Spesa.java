import java.util.ArrayList;
import java.util.Scanner;

public class Spesa {

    ArrayList<String> prodotti = new ArrayList<String>();

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto");
        String prodotto = scanner.nextLine();
        prodotti.add(prodotto);

    }

    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto da rimuovere" + prodotti);
        String product = scanner.nextLine();
        prodotti.remove(product);

    }

    public void stampaSpesa() {
        for (String prodotto : prodotti) { // for each
            System.out.println(prodotto);
        }
    }
}