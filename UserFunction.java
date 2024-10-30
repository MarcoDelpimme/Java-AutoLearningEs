import java.util.ArrayList;

public class UserFunction {

    private ArrayList<User> users;

    public UserFunction() {
        this.users = new ArrayList<>();
        users.add(new User("admin", "admin1234", true));
    }

    public boolean register(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                System.out.println("errore: Nome esistente");
                return false;
            }
        }
        users.add(new User(username, password, false));
        System.out.println("utente registrato");
        return true;
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.login(password)) {
                    System.out.println("Login effettuato con successo per l'utente: " + username);
                    return true;
                } else {
                    System.out.println("Errore: Password non corretta.");
                    return false;
                }
            }
        }
        System.out.println("Errore: Utente non esistente.");
        return false;
    }

    public void logout(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                if (user.isLoggedIn()) {
                    user.logout();
                    System.out.println("utente disconnesso");
                }
                return;

            }
        }

    }
}
