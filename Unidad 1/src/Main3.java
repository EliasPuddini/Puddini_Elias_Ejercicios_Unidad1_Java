import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        System.out.println("Hola, ingrese un numero para ver si es par.");
        Scanner scaneo = new Scanner(System.in);
        Double numeroPolenta = scaneo.nextDouble();
        Double paridad = numeroPolenta%2;

        if(paridad == 0){
            System.out.println("el numero es par.");
        }else{
            System.out.println("el numero es impar.");
        }
    }

}
