import java.util.ArrayList;

public class Videoteca {
    private ArrayList<Film> filmAvailable;
    private ArrayList<User> userRegistered;

    public Videoteca() {
        filmAvailable = new ArrayList<>();
        userRegistered = new ArrayList<>();
    }

    public void addFilm(Film film) {
        filmAvailable.add(film);
        System.out.println("Film added: " + film.getTitle());
    }

    public void removeFilm(String title) {
        for (int i = 0; i < filmAvailable.size(); i++) {
            if (filmAvailable.get(i).getTitle().equals(title)) {
                filmAvailable.remove(i);
                System.out.println("Film removed: " + title);
                return;
            }
        }
        System.out.println("Film not found: " + title);
    }

    public void registerUser(User user) {
        userRegistered.add(user);
        System.out.println("User registered: " + user.getName());
    }

    public boolean rentFilm(User user, Film film) {

        if (!userRegistered.contains(user)) {
            System.out.println("User not registered");
            return false;
        }

        for (Film availableFilm : filmAvailable) {
            if (availableFilm.getTitle().equals(film.getTitle())) {
                user.rentFilm(availableFilm);
                filmAvailable.remove(availableFilm);
                System.out.println("Film rented: " + availableFilm.getTitle());
                return true;
            }
        }

        System.out.println("Film not available");
        return false;
    }

    public void returnFilm(User user, Film film) {
        user.returnFilm(film);
        filmAvailable.add(film);
        System.out.println("Film returned: " + film.getTitle());
    }

    public ArrayList<Film> getFilmAvailable() {
        return filmAvailable;
    }

    public User findUserById(int id) {
        for (User user : userRegistered) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
