import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        System.out.println("Hola, ingrese una linea de caracteres.");
        Scanner scaneo1 = new Scanner(System.in);
        String Plinea = scaneo1.nextLine();

        System.out.println("Ahora ingrese otra linea de caracteres.");
        Scanner scaneo2 = new Scanner(System.in);
        String Slinea = scaneo2.nextLine();

        System.out.println("Son iguales las cadenas?" + " " + Plinea.equals(Slinea));
    }

}
