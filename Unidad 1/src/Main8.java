import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();

        boolean esPrimo = esPrimo(num);
        if (esPrimo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
    static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
