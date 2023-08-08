import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {

        int num;
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Ingresa un número (0 para salir): ");
            num = scanner.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        }while(num != 0);

        System.out.println("Fin.");
        System.out.println("Números ingresados son: " + numeros);

    }
}
