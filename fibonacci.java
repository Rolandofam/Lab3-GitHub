import java.util.Scanner;
class Fibonacci {
    public static int calcularFibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
    }
    public void normal(int nn)
    {
        int a = 0, b = 1;
        for (int i = 1; i <= nn; i++) {
            System.out.print(a + " ");
            int siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el valor de n: ");
        int n = scanner.nextInt();
        Fibonacci fibo=new Fibonacci();
        fibo.normal(n);
        for (int i = 0; i < n; i++) {
            System.out.print(calcularFibonacciRecursivo(i) + " ");
        }
        scanner.close();
    }
}

