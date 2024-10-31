import java.util.Scanner;

public class ManagementFilm {
    private Videoteca videoteca;

    public ManagementFilm() {
        videoteca = new Videoteca();
    }

    public void startProgram() {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.println("Choose an option:");
            System.out.println("1. Add Film");
            System.out.println("2. Remove Film");
            System.out.println("3. Register User");
            System.out.println("4. Rent Film");
            System.out.println("5. Film Available");
            System.out.println("6. Rented Films List from user");
            System.out.println("7. Exit");

            int chose = scanner.nextInt();
            scanner.nextLine();

            switch (chose) {
                case 1:
                    System.out.println("Insert Title of film to add");
                    String title = scanner.nextLine();
                    System.out.println("Insert Year of the film");
                    int year = scanner.nextInt();
                    videoteca.addFilm(new Film(title, year));
                    break;

                case 2:
                    System.out.println("Insert Title of film to remove");
                    String titleRemove = scanner.nextLine();
                    videoteca.removeFilm(titleRemove); // Passa solo il titolo
                    break;

                case 3:
                    System.out.println("Insert ID of user");
                    int idUser = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Insert Name of user");
                    String nameUser = scanner.nextLine();
                    videoteca.registerUser(new User(idUser, nameUser));
                    break;

                case 4:
                    System.out.println("Insert ID of user for rent");
                    int idUserRented = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Available films:");
                    for (Film film : videoteca.getFilmAvailable()) {
                        System.out.println(film.getTitle() + " (" + film.getYear() + ")");
                    }

                    System.out.println("Insert Title of film");
                    String titleRented = scanner.nextLine();

                    User userRented = videoteca.findUserById(idUserRented);
                    if (userRented != null) {

                        Film filmToRent = new Film(titleRented, 0);
                        boolean rented = videoteca.rentFilm(userRented, filmToRent);
                        if (!rented) {
                            System.out.println("Failed to rent the film.");
                        }
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 5:
                    System.out.println("Films available: ");
                    for (Film film : videoteca.getFilmAvailable()) {
                        System.out.println(film.getTitle() + " (" + film.getYear() + ")");
                    }
                    break;

                case 6:
                    System.out.print("Insert ID of user: ");
                    int idUserRentedList = scanner.nextInt();
                    User userRentedList = videoteca.findUserById(idUserRentedList);
                    if (userRentedList != null) {
                        userRentedList.indexRentedFilms();
                    } else {
                        System.out.println("User not found.");
                    }
                    break;

                case 7:
                    continueProgram = false;
                    break;

                default:
                    System.out.println("Invalid option");
            }
        }

        scanner.close();
    }
}
