import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int num = scanner.nextInt();

        String resultado = esPar(num) ? "par" : "impar";
        System.out.println("El número es " + resultado);
    }

    static boolean esPar(int num) {
        return num % 2 == 0;
    }
}