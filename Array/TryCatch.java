import java.util.Scanner;

public class TryCatch {

    public void arrayInteger() {

        try {
            int[] numbers = { 10, 20, 30, 40, 50 };
            Scanner scanner = new Scanner(System.in);

            System.out.println("Inserisci un indice : ");
            int index = scanner.nextInt();
            System.out.println("inserisci un numero : ");
            int number = scanner.nextInt();
            int result = numbers[index] / number;
            System.out.println(result);

            scanner.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("SIndex out.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic err.");
        } finally {

        }
    }
}

// public void arrayoutofbound() {
// try {

// Scanner scanner = new Scanner(System.in);
// System.out.println("Inserisci un numero: ");
// int number = scanner.nextInt();
// System.out.println("inserisci un altro numero: ");
// int number2 = scanner.nextInt();
// int result = number * number2;
// System.out.println(result);

// scanner.close();
// } catch (Exception e) {
// System.out.println("Something went wrong.");
// } finally {
// System.out.println("The 'try catch' is finished.");
// }
// }
//
