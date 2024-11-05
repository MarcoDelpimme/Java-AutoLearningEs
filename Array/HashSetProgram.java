import java.util.HashSet;
import java.util.Scanner;

public class HashSetProgram {
    private HashSet<Integer> insieme1 = new HashSet<>();
    private HashSet<Integer> insieme2 = new HashSet<>();

    public void addNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci 5 numeri per il primo insieme:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            insieme1.add(scanner.nextInt());
        }

        System.out.println("Inserisci 5 numeri per il secondo insieme:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            insieme2.add(scanner.nextInt());
        }
    }

    public void printNumbers() {
        System.out.println("Insieme 1: " + insieme1);
        System.out.println("Insieme 2: " + insieme2);
    }

    public void commonNumbers() {
        HashSet<Integer> commonNumbers = new HashSet<>(insieme1);
        commonNumbers.retainAll(insieme2);
        System.out.println("Numeri comuni: " + commonNumbers);
    }

    public static void main(String[] args) {
        HashSetProgram program = new HashSetProgram();
        program.addNumbers();
        program.printNumbers();
        program.commonNumbers();
    }
}
