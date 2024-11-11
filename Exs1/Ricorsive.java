
// 

public class Ricorsive {

    // Fibonacci method è un metodo che richiama se stesso
    // nel caso base if rappresenta il caso base della ricorsione. Questo controllo
    // permette la metodo di sapere quando fermarsi.
    // se n è uguale a 0 restituisce 0, se n é 1 restituisce 1

    // 0 1 1 2 3 5 8 13 21 34 55
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int a = fibonacci(n - 1);
        int b = fibonacci(n - 2);
        // fibonacci 1 viene chiamato 9 volte

        // fibonacci 2 viene chiamato 8 volte
        return a + b;

    }
}