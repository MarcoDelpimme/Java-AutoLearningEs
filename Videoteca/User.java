import java.util.ArrayList;

public class User {

    private int id;
    private String name;
    ArrayList<Film> filmsRent = new ArrayList<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void rentFilm(Film film) {

        filmsRent.add(film);
    }

    // Quarantena
    public void returnFilm(Film film) {
        if (filmsRent.remove(film)) {
            System.out.println("Film returned");
        }
        ;
    }
    // Quarantena

    public void indexRentedFilms() {
        for (Film film : filmsRent) {
            System.out.println(film.getTitle() + " (" + film.getYear() + ")");

        }
    }
}