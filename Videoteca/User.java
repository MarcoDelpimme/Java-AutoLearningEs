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

    public void returnFilm(Film film) {
        boolean removed = filmsRent.remove(film);
        if (removed) {
            System.out.println("Film returned: " + film.getTitle());
        } else {
            System.out.println("Film not found in rented films.");
        }
    }

    public void indexRentedFilms() {
        if (filmsRent.isEmpty()) {
            System.out.println("No rented films.");
            return;
        }
        for (Film film : filmsRent) {
            System.out.println(film.getTitle() + " (" + film.getYear() + ")");
        }
    }

    public boolean hasRentedFilm(Film film) {
        return filmsRent.contains(film);
    }
}
