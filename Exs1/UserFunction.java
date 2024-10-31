import java.util.ArrayList;
import java.util.List;

public class UserFunction {
    private List<User> users = new ArrayList<>();

    public void register(String username, String password) {
        if (getUserByUsername(username) != null) {
            System.out.println("Utente già registrato.");
        } else {
            users.add(new User(username, password));
            System.out.println("Registrazione completata.");
        }
    }

    public boolean login(String username, String password) {
        User user = getUserByUsername(username);
        if (user != null && user.checkPassword(password)) {
            System.out.println("Login effettuato.");
            return true;
        } else {
            System.out.println("Credenziali non valide.");
            return false;
        }
    }

    public void logout(String username) {
        if (getUserByUsername(username) != null) {
            System.out.println("Logout effettuato.");
        } else {
            System.out.println("Utente non trovato.");
        }
    }

    public void addTask(String username, String taskDescription) {
        User user = getUserByUsername(username);
        if (user != null) {
            user.addTask(taskDescription);
        } else {
            System.out.println("Utente non trovato.");
        }
    }

    public void viewTasks(String username) {
        User user = getUserByUsername(username);
        if (user != null) {
            user.viewTasks();
        } else {
            System.out.println("Utente non trovato.");
        }
    }

    public void deleteTask(String username, int taskIndex) {
        User user = getUserByUsername(username);
        if (user != null) {
            user.deleteTask(taskIndex - 1);
        } else {
            System.out.println("Utente non trovato.");
        }
    }

    private User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
