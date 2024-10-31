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
        System.out.println("Film added" + film.getTitle());
    }

    public void removeFilm(Film film) {

        if (filmAvailable.remove(film)) {
            System.out.println("Film removed" + film.getTitle());
        } else {
            System.out.println("Film not found");
        }
    }

    public void registerUser(User user) {
        userRegistered.add(user);
        System.out.println("User registered" + user.getName());
    }

    public void rentFilm(User user, Film film) {
        if (filmAvailable.contains(film) && userRegistered.contains(user)) {
            user.rentFilm(film);
            removeFilm(film);

        } else {
            System.out.println("Film not available or user not registered");
        }

    }

    public void returnFilm(User user, Film film) {

        user.returnFilm(film);
        filmAvailable.add(film);
        System.out.println("Film returned" + film.getTitle());
    }

    public ArrayList<Film> getFilmAvailable() {
        return filmAvailable;
    }

}