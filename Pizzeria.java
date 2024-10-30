import java.util.Scanner;

public class Pizzeria {

    public static String[] addToMenu(String[] menu, String newItem) {
        String[] newMenu = new String[menu.length + 1];
        System.arraycopy(menu, 0, newMenu, 0, menu.length);
        newMenu[menu.length] = newItem;
        return newMenu;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String adminUsername = "admin";
        String adminPassword = "admin123";

        String userUsername = "";
        String userPassword = "";
        boolean isAdmin = false;
        boolean isLoggedIn = false;

        String[] menu = {
                "Margherita",
                "Diavola",
                "Hawaii",
                "Vegetariana",
                "Quattro Stagioni",
                "Napoletana",
                "Capricciosa",
        };

        while (true) {
            System.out.println(
                    "Benvenuto! Vuoi fare il login o registrarti? (1 per login / 2 per registrarti / 3 per uscire)");
            int scelta = scanner.nextInt();
            scanner.nextLine();

            if (scelta == 1) {
                System.out.println("Inserisci username: ");
                String username = scanner.nextLine();
                System.out.println("Inserisci password: ");
                String password = scanner.nextLine();

                if (username.equals(adminUsername) && password.equals(adminPassword)) {
                    isAdmin = true;
                    isLoggedIn = true;
                } else if (username.equals(userUsername) && password.equals(userPassword)) {
                    isAdmin = false;
                    isLoggedIn = true;
                } else {
                    System.out.println("Credenziali sbagliate");
                }

            } else if (scelta == 2) {
                System.out.print("Crea username: ");
                userUsername = scanner.nextLine();
                System.out.print("Crea password: ");
                userPassword = scanner.nextLine();
                System.out.println("Registrazione completata! Ora puoi effettuare il login.");
            } else if (scelta == 3) {
                System.out.println("Uscita dal programma.");
                break;
            } else {
                System.out.println("Scelta non valida.");
            }

            while (isLoggedIn) {
                if (isAdmin) {
                    System.out.println("Modifica lista delle pizze:");
                    System.out.println("Menu attuale:");
                    for (String item : menu) {
                        System.out.println(item);
                    }

                    System.out.println("Vuoi aggiungere una nuova pizza al menu? (s/n)");
                    String modifyMenu = scanner.nextLine();
                    if (modifyMenu.equalsIgnoreCase("s")) {
                        System.out.println("Inserisci la nuova pizza:");
                        String newItem = scanner.nextLine();
                        menu = addToMenu(menu, newItem);
                        System.out.println("Nuova pizza aggiunta al menu!");
                    }

                    System.out.println("Vuoi tornare alla schermata di login? (s/n)");
                    String exit = scanner.nextLine();
                    if (exit.equalsIgnoreCase("s")) {
                        isLoggedIn = false;
                        break;
                    }

                } else {
                    System.out.println("Menu Ordinazioni:");
                    for (String item : menu) {
                        System.out.println(item);
                    }

                    System.out.println("Cosa vuoi ordinare? (scrivi il nome della pizza o 'esci' per terminare)");
                    while (true) {
                        String order = scanner.nextLine();
                        if (order.equalsIgnoreCase("esci")) {
                            break;
                        } else {
                            System.out.println("Hai ordinato: " + order);
                            System.out.println("Grazie per aver ordinato!");
                            break;
                        }
                    }

                    System.out.println("Vuoi tornare alla schermata di login? (s/n)");
                    String backToLogin = scanner.nextLine();
                    if (backToLogin.equalsIgnoreCase("s")) {
                        isLoggedIn = false;
                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}
