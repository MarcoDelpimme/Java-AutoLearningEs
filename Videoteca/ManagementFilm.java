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
            System.out.println("6. Rented Films List from user ");
            System.out.println("7. Exit");

            int chose = scanner.nextInt();
            switch (chose) {
                case 1:
                    System.out.println("insert Title of film to add");
                    String title = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("insert Year of the film ");
                    int year = scanner.nextInt();
                    videoteca.addFilm(new Film(title, year));
                    break;

                case 2:
                    System.out.println("insert Title of film");
                    String titleRemove = scanner.nextLine();
                    videoteca.removeFilm(new Film(titleRemove, 0));
                    break;

                case 3:
                    System.out.println("insert ID of user");
                    int idUser = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("insert Name of user");
                    String nameUser = scanner.nextLine();
                    videoteca.registerUser(new User(idUser, nameUser));
                    break;

                case 4:
                    System.out.println("insert ID of user for rent");
                    int idUserRented = scanner.nextInt();
                    System.out.println("insert name of user");
                    String nameUserRented = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println(.());
                    System.out.println("insert Title of film");
                    String titleRented = scanner.nextLine();
                    videoteca.rentFilm(new User(idUserRented, nameUserRented), new Film(titleRented, 0));
                    break;

                case 5:
                    System.out.println("Films available: ");
                    for (Film film : videoteca.getFilmAvailable()) {
                        System.out.println(film.getTitle() + " (" + film.getYear() + ")");
                        break;
                    }
                    // case 6:
                    // System.out.print("insert ID of user");
                    // int idUserRentedList = scanner.nextInt();
                    // System.out.println("insert name of user: ");
                    // videoteca.indexRentedFilms(new User(idUserRentedList, ""));
                    // break;
                case 6:
                    continueProgram = false;
                    break;
                default:
                    System.out.println("invalid option");
            }

        }
    }
}