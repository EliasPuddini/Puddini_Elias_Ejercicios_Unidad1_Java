import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        int num;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Ingresa un número (0 para salir): ");
            num = scanner.nextInt();
            if (num != 0) {
                numeros.add(num);
            }
        }while(num != 0);


        int sumaImpares = sumarNumerosImpares(numeros);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }


    static int sumarNumerosImpares(List<Integer> numeros) {
        int suma = 0;
        for (int num : numeros) {
            if (num % 2 != 0) {
                suma += num;
            }
        }
        return suma;
    }
}
