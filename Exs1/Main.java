
// per dichiarare una constant basta mettere final prima del tipo di una variabile es: final int x = 0;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Moltiplicatore moltiplicatore = new Moltiplicatore();
        System.out.println(moltiplicatore.moltiplica(1, 2, 3, 4));
        System.out.println(moltiplicatore.moltiplica(1, 2, 3));
        System.out.println(moltiplicatore.moltiplica(1, 2));

        Animale animaleAll = new Animale();
        animaleAll.verso();

        Animale gatto = new Gatto();
        gatto.verso();

        // int base = 3, esponente = 3;
        // System.out.println("la potenza di " + base + "^" + esponente + " " + "e':" +
        // ElevamentoPotenza.potenza(3, 3));

        // Ricorsive ricorsive = new Ricorsive();
        // System.out.println("Il numero di Fibonacci per 10 e': " +
        // ricorsive.fibonacci(10));
        // UserFunction userFunction = new UserFunction();
        // Scanner scanner = new Scanner(System.in);
        // boolean exit = false;
        // while (!exit) {
        // System.out.println("\nSeleziona un'opzione:");
        // System.out.println("1. Register");
        // System.out.println("2. Login");
        // System.out.println("3. Logout");
        // System.out.println("4. Aggiungi Task");
        // System.out.println("5. Visualizza Task");
        // System.out.println("6. Elimina Task");
        // System.out.println("7. Exit");
        // System.out.print("Inserisci la tua opzione: ");
        // int scelta = scanner.nextInt();

        // String username, password;
        // switch (scelta) {
        // case 1:
        // System.out.print("Inserisci username: ");
        // username = scanner.next();
        // System.out.print("Inserisci password: ");
        // password = scanner.next();
        // userFunction.register(username, password);
        // break;
        // case 2:
        // System.out.print("Inserisci username: ");
        // username = scanner.next();
        // System.out.print("Inserisci password: ");
        // password = scanner.next();
        // userFunction.login(username, password);
        // break;
        // case 3:
        // System.out.print("Inserisci username: ");
        // username = scanner.next();
        // userFunction.logout(username);
        // break;
        // case 4:
        // System.out.print("Inserisci username: ");
        // username = scanner.next();
        // System.out.print("Inserisci descrizione task: ");
        // scanner.nextLine(); // Consuma il newline rimanente
        // String taskDescription = scanner.nextLine();
        // userFunction.addTask(username, taskDescription);
        // break;
        // case 5:
        // System.out.print("Inserisci username: ");
        // username = scanner.next();
        // userFunction.viewTasks(username);
        // break;
        // case 6:
        // System.out.print("Inserisci username: ");
        // username = scanner.next();
        // System.out.print("Inserisci indice task da eliminare: ");
        // int taskIndex = scanner.nextInt();
        // userFunction.deleteTask(username, taskIndex);
        // break;
        // case 7:
        // System.out.println("Stai uscendo dal programma. Arrivederci!");
        // exit = true;
        // break;
        // default:
        // System.out.println("Scelta non valida.");
        // break;
        // }
        // }
        // scanner.close();
    }

    // System.out.println("Hello World!");

    // ArrayList<String> players = new ArrayList<>();
    // players.add("Daniele Cali'");
    // players.add("Fabio De Biase");
    // players.add("Giuseppe Saccone");
    // players.add("Giusy D'Ambrosio");
    // players.add("Luca Mancogna");
    // players.add("Christian pizzo");
    // players.add("Maria Rosaria Impilli");
    // players.add("Paolo Mariano Fidanza");
    // players.add("Riccardo Manfellotto");
    // players.add("Steliyana Vasileva");
    // Collections.shuffle(players);

    // ArrayList<ArrayList<String>> groups = new ArrayList<>();

    // ArrayList<String> bestGroup = new ArrayList<>();
    // bestGroup.add("Marco Delpopolo");
    // bestGroup.add("Giorgio Madeo");
    // bestGroup.add("Saverio Semeraro");
    // bestGroup.add("Roccaldo Digrisolo");
    // groups.add(bestGroup);

    // for (int i = 0; i < 3; i++) {
    // groups.add(new ArrayList<>());
    // }

    // for (int i = 0; i < players.size(); i++) {
    // groups.get((i % 3) + 1).add(players.get(i));
    // }

    // for (int i = 0; i < groups.size(); i++) {
    // System.out.println("group " + (i + 1) + ": " + groups.get(i));
    // }

    //

    // Calculator calculator1 = new Calculator();

    // double result = calculator1.add(1, 1) + calculator1.divide(1, 1);

    // if (result == 0) {
    // System.out.println("Sei una capra");
    // } else {
    // System.out.println(result);
    // }

    // static method

    // static method

    // System.out.print("inserisci la tua eta': ");
    // int age = scanner.nextInt();
    // scanner.close();
    // Person person = new Person(name, surname, age);
    // person.displayInfo();
    // person.secretFunction();
    // person.displayInfo();
    // scanner.close();
    // Saverio.Name = "Saverio";
    // Saverio.Surname = "Semeraro";
    // Saverio.Age = 20;
    // Saverio.displayInfo();
    // Saverio.secretFunction();
    // Person.secret();
    // int result2 = calculator1.divide(10, 5);

    // System.out.println(2);
    // countChar();
    // iteringArray2();
    // Variable variable = new Variable();

    // variable.altezza = 10;
    // variable.larghezza = 20;
    // System.out.println(variable.area(variable.altezza, variable.larghezza));
    // System.out.println(variable.ipotenusa(variable.altezza, variable.larghezza,
    // variable.area(variable.altezza, variable.larghezza)));

    // System.out.println(variable.arrotonda(2.9d));

    // Scanner myObj = new Scanner(System.in);
    // String number = "";

    // while (!number.equals("4")) {
    // System.out.println("Inserisci un numero");
    // number = myObj.nextLine();

    // if (number.equals("2") || number.equals("3")) {
    // System.out.println("AHAH AHAH");
    // String test = myObj.nextLine();
    // System.out.println(number + test);

    // } else if (number.equals("4")) {
    // System.out.println(number);
    // }
    // }
    // System.out.println("Benvenuti al corso di JAVA" + " " + number);
    // myObj.close();

    // System.out.println("Inserisci un numero");

    // String number = myObj.nextLine(); // legge lìinput inserito
    // if (number.equals("2") || number.equals("3")) {
    // System.out.println("Inserisci un'altra numero");
    // String test = myObj.nextLine();
    // System.out.println(number + test);
    // } else {
    // System.out.println(number);
    // }

    public static void nameArrayList() {
        ArrayList<String> users = new ArrayList<String>();
        Scanner myObj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci i nomi ti mancano " + (5 - i) + " per terminare");
            String name = myObj.nextLine();
            users.add(name);
        }
        System.out.println("cerca un nome");
        String name = myObj.nextLine();
        if (users.contains(name)) {
            System.out.println("il nome esiste");
        } else {
            System.out.println("il nome non esiste");
        }
        System.out.println("Elimina un nome");
        String name2 = myObj.nextLine();
        if (users.contains(name2)) {
            users.remove(name2);
            System.out.println("utente eliminato");
        } else {
            System.out.println("il nome non esiste");
        }
        System.out.println("modifica un nome esistente tra questi" + users);
        String name3 = myObj.nextLine();
        if (users.contains(name3)) {
            System.out.println("inserisci nuovo nome");
            String name4 = myObj.nextLine();
            users.set(users.indexOf(name3), name4);
            Collections.sort(users);
            System.out.println("utente modificato");

        } else {
            System.out.println("il nome non esiste");
        }
        myObj.close();
        System.out.println(users);
    }

    public static void michaelFunction() {
        Scanner myObj = new Scanner(System.in);
        System.out.print("inserisci un numero per array:");
        int arr3 = myObj.nextInt();
        System.out.print("inserisci un numero per array:");
        int arr4 = myObj.nextInt();

        int[] michaelArray = new int[arr3];
        int[] marcoArray = new int[arr4];
        for (int i = 0; i < michaelArray.length; i++) {
            michaelArray[i] = (int) (Math.random() * 11);
            System.out.print(michaelArray[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < marcoArray.length; i++) {
            marcoArray[i] = (int) (Math.random() * 11);
            System.out.print(marcoArray[i] + "\t");
        }
        System.out.println();

        boolean foundCommon = false;

        for (int i = 0; i < michaelArray.length; i++) {
            for (int j = 0; j < marcoArray.length; j++) {
                if (michaelArray[i] == marcoArray[j]) {
                    System.out.print(michaelArray[i] + "\t");
                    foundCommon = true;
                    break;
                }
            }
        }
        if (!foundCommon) {
            System.out.println("Non ci sono numeri comuni");
        } else {
            System.out.println("Ci sono numeri comuni");
        }
        myObj.close();
    }

    public static void bidimentionalArray() {
        // int[][] bidimentionalArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10,
        // 11, 12 } };
        Scanner myObj = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int arr1 = myObj.nextInt();
        System.out.print("Inserisci un numero: ");
        int arr2 = myObj.nextInt();

        int[][] randomArray = new int[arr1][arr2];
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                randomArray[i][j] = (int) (Math.random() * 101);
                System.out.print(randomArray[i][j] + "\t");

            }
            System.out.println();
        }

        myObj.close();
        System.exit(0);
        // for (int i = 0; i > bidimentionalArray.length; i++) {
        // for (int j = 0; j > bidimentionalArray[i].length; j++) {
        // System.out.println(bidimentionalArray[i][j]);
        // }
        // }

    }

    public static void printArray() {
        String[] array = { "Mario", "Danile", "Giulio", "Orazio", "Paolo" };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void iteringArray2() {
        String[] array2 = new String[5];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array2.length; i++) {
            System.out.print("inserisci nome " + (i + 1) + ": ");

            array2[i] = scanner.nextLine();
        }

        for (String i : array2) {
            System.out.println(i);
        }
        scanner.close();
    }

    public static void ciao() {
        System.out.println("Ciao");
        bad();
    }

    public static void sum(int a, int b) {

        if (a + b > 10) {
            System.out.println(a + b);
        } else {
            System.out.println("sono una capra");
        }

        int[] numero = new int[8];
        numero[0] = 2;
        numero[1] = 4;
        numero[2] = 7;
        numero[3] = 1;
        numero[4] = 8;
        numero[5] = 1;
        numero[6] = 3;
        numero[7] = 12;

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

    }

    public static void write2numbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int number1 = scanner.nextInt();
        System.out.print("Inserisci un altro numero: ");
        int number2 = scanner.nextInt();

        for (int i = number1 + 1; i <= number2 - 1; i++) {
            System.out.println(i);
        }

    }

    public static void countChar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        String character = "a" + "e" + "i" + "o" + "u";
        for (int i = 0; i < character.length(); i++) {
            if (parola.contains(character.toUpperCase().charAt(i) + "")) {
                System.out.println("La parola contiene le lettere " + character.charAt(i));
            }

        }
        scanner.close();

    }

    // ____________________________________________________________
    public static void benvenuto() {
        System.out.println("Benvenuti al corso di Java!");
    }

    public static void benvenutoUtente() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.println("Benvenuto, " + nome + "!");
    }

    public static void sommaVariabili() {
        int a = 10, b = 20, c = 30;
        System.out.println("La somma delle variabili è: " + (a + b + c));
    }

    // 4
    public static void valorePI() {
        double pi = 3.14;
        System.out.println("Il valore di PI è: " + pi);
    }

    // 5
    public static void maggiorenne() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        if (eta >= 18) {
            System.out.println("Sei maggiorenne.");
        } else {
            System.out.println("Sei minorenne.");
        }
    }

    // 6
    public static void pariDispari() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Il numero è pari.");
        } else {
            System.out.println("Il numero è dispari.");
        }
    }

    // 7
    public static void numeriDaUnoADieci() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // 8
    public static void fattoriale() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        int fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
    }

    // 9
    public static void numeroMaggiore() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Il numero maggiore è: " + Math.max(num1, num2));
    }

    // 10
    public static void numeroMinimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il primo numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Inserisci il secondo numero: ");
        int num2 = scanner.nextInt();
        System.out.print("Inserisci il terzo numero: ");
        int num3 = scanner.nextInt();
        int minimo = Math.min(num1, Math.min(num2, num3));
        System.out.println("Il numero minimo è: " + minimo);
    }

    // 11
    public static void parolaAlContrario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine();
        StringBuilder parolaContrario = new StringBuilder(parola);
        System.out.println("La parola al contrario è: " + parolaContrario.reverse());
    }

    // 12
    public static void tabellina() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    // 13
    public static void numeroPrimo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        boolean primo = numero > 1;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                primo = false;
                break;
            }
        }
        if (primo) {
            System.out.println(numero + " è un numero primo.");
        } else {
            System.out.println(numero + " non è un numero primo.");
        }
    }

    // ____________________________________________________________

    public static void sommaNumeriPrimi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        int somma = 0;
        for (int i = 2; i <= numero; i++) {
            boolean primo = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    primo = false;
                    break;
                }
            }
            if (primo) {
                somma += i;
            }
        }
        System.out.println("La somma dei numeri primi da 2 a " + numero + " è: " + somma);
    }

    public static void number20() {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
    }

    public static void bad() {
        System.out.println("mi chiamo marco");
    }

    public static void fattoriale2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = scanner.nextInt();
        int fattoriale = 1;
        for (int i = 1; i <= numero; i++) {
            fattoriale *= i;
        }
        System.out.println("Il fattoriale di " + numero + "è: " + fattoriale);
    }

    public static void tableOf10() {
        Scanner myObj = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = myObj.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void countdown() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1000 millisecondi = 1 secondo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
