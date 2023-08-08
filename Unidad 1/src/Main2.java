import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {


        System.out.println("Hola, ingrese el primer numero. ");
        Scanner scanner = new Scanner(System.in);
        Long variable1 = scanner.nextLong();

        System.out.println("Ingrese el segundo numero.");
        Scanner scanner1 = new Scanner(System.in);
        Long variable2 = scanner1.nextLong();

        System.out.println("Ingrese el tercer numero.");
        Scanner scanner2 = new Scanner(System.in);
        Long variable3 = scanner2.nextLong();


        if(variable1 <= variable2){
            if(variable2 < variable3){
                System.out.println("el tercer numero ingresado es el mayor");
            }
            if(variable2 > variable3){
                System.out.println("el segundo numero ingresado es el mayor.");
            }
        }
        if (variable1 >= variable2){
            if(variable3 < variable1){
                System.out.println("el primer numero ingresado es el mayor.");
            }
            if(variable3 > variable1){
                System.out.println("el tercer numero ingresado es el mayor");
            }
        }


    }
}
