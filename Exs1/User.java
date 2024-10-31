import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Task> tasks;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.tasks = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task aggiunta: " + description);
    }

    public void viewTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Non ci sono task.");
        } else {
            System.out.println("Task di " + username + ":");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }

    public void deleteTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            Task removedTask = tasks.remove(index);
            System.out.println("Task rimossa: " + removedTask);
        } else {
            System.out.println("Indice task non valido.");
        }
    }
}
