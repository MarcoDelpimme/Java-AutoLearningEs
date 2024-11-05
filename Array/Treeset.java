import java.util.Scanner;
import java.util.TreeSet;

public class Treeset {
    TreeSet<String> treeSet = new TreeSet<>();

    public void addCity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il nome della città: ");
        String city = scanner.nextLine();
        treeSet.add(city);
    }

    public void orderedCities() {
        for (String city : treeSet) {
            System.out.println(city);
        }
    }

}
