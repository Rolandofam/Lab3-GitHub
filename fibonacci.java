import java.util.Scanner;
public class fibonacci {
    public static int calcularFibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return calcularFibonacciRecursivo(n - 1) + calcularFibonacciRecursivo(n - 2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(scanner.System.in);
        System.out.print("¿Cuántos términos de la serie deseas generar?: ");
        int terminos = scanner.nextInt();
        System.out.println("Serie de Fibonacci (Algoritmo Recursivo):");
        for (int i = 0; i < terminos; i++) {
            System.out.print(calcularFibonacciRecursivo(i) + " ");
        }
        System.out.println();
        scanner.close();
    }
}
