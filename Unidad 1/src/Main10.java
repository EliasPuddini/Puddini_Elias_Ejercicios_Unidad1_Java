import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Ingresa números separados por espacios (0 para terminar): ");
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (num == 0) {
                break;
            }
            numeros.add(num);
        }

        imprimirPares(numeros);
        int sumaPrimos = sumarNumerosPrimos(numeros);
        System.out.println("La suma de los números primos es: " + sumaPrimos);
    }

    static void imprimirPares(List<Integer> numeros) {
        System.out.print("Números pares: ");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
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
    static int sumarNumerosPrimos(List<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (esPrimo(num)) {
                suma += num;
            }
        }
        return suma;
    }
}





