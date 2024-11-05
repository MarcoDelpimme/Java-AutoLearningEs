import java.util.HashMap;
import java.util.Scanner;

public class Price {

    HashMap<String, Double> products = new HashMap<>();

    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto");
        String prodotto = scanner.nextLine();
        System.out.println("Inserisci il prezzo del prodotto");
        double prezzo = scanner.nextDouble();
        products.put(prodotto, prezzo);

    }

    public void deleteProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome del prodotto da rimuovere");
        String product = scanner.nextLine();
        products.remove(product);
    }

    public void stampaSpesa() {
        for (String prodotto : products.keySet()) {
            System.out.println(prodotto + " " + products.get(prodotto));
        }
    }
}
