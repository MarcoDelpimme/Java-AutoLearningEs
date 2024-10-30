
public class User {

    String username;
    String password;
    private boolean isAdmin;
    private boolean isLoggedIn;

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isLoggedIn = false;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public boolean login(String password) {
        if (this.password.equals(password)) {

            this.isLoggedIn = true;
            return true;
        }
        return false;
    }

    public void logout() {
        this.isLoggedIn = false;
    }

}

// creare una classe utente con usr, psw, ed eventuali metodi. Creare un admin
// preimpostato. Permettere di fare la registrazione e login evitando i vari
// tipi di errore come usr ripetuto o richiesta di login da usr inesistente
