import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) {

        System.out.println(" Hola, ingrese un nombre. ");
        Scanner scanner = new Scanner(System.in);
        String variableA = scanner.nextLine();

        System.out.println("Ahora ingrese un apellido. ");
        Scanner scanner2 = new Scanner(System.in);
        String variableB = scanner2.nextLine();

        System.out.println(" Hola. Mi nombre es " + variableA + " " + variableB);

    }
}