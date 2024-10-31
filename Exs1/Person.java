import java.util.Scanner;

public class Person {
    String name;
    String surname;
    int age;

    // Esempio
    public Person() {

        this.name = "";
        this.surname = "";
        this.age = 0;

    }

    // Constructor
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;

    }

    public void displayInfo(

    ) {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
    }

    static void secret() {
        System.out.println("Sono ricco D'AMORE!");
    }

    private void superSecret() {
        System.out.println("Sono povero!");
    }

    public void secretFunction() {
        superSecret();
    }

}
