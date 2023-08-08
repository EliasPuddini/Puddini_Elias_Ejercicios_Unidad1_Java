import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int capacidadMaxima = 500;
        int dineroRecaudado = 0;

        int opcion;
        do {
            System.out.println("Menú de Gestión del Boliche:");
            System.out.println("1. Ingreso de datos");
            System.out.println("2. Capacidad disponible");
            System.out.println("3. Dinero recaudado");
            System.out.println("0. Salir del sistema");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    scanner.nextLine(); // Limpiar el buffer
                    System.out.print("Ingresa tu nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Ingresa tu edad: ");
                    int edad = scanner.nextInt();

                    System.out.print("Ingresa tu DNI: ");
                    int dni = scanner.nextInt();

                    boolean aptoIngreso = edad > 21;
                    boolean paseVip = false;
                    boolean paseDescuento = false;

                    if (aptoIngreso) {
                        System.out.print("¿Tienes pase VIP? (true/false): ");
                        paseVip = scanner.nextBoolean();

                        if (!paseVip) {
                            System.out.print("¿Tienes pase con descuento? (true/false): ");
                            paseDescuento = scanner.nextBoolean();
                        }

                        int costoEntrada = (paseVip) ? 0 : (paseDescuento) ? 750 : 1500;
                        System.out.println("Costo de la entrada: " + costoEntrada);
                        System.out.print("¿Deseas entrada normal (1) o VIP (2)?: ");
                        int tipoEntrada = scanner.nextInt();

                        if (tipoEntrada == 2 && !paseVip) {
                            costoEntrada = 2000;
                        }

                        dineroRecaudado += costoEntrada;

                        System.out.println("¡Bienvenido(a), " + nombre + "!");
                    } else {
                        System.out.println("Lo siento, debes ser mayor de 21 años para ingresar.");
                    }
                    break;
                case 2:
                    int capacidadDisponible = capacidadMaxima - (dineroRecaudado / 1500);
                    System.out.println("Capacidad disponible: " + capacidadDisponible + " personas");
                    break;
                case 3:
                    System.out.println("Dinero recaudado: $" + dineroRecaudado);
                    break;
                case 0:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción inválida. Inténtalo de nuevo.");
                    break;
            }
        } while (opcion != 0);
    }
}
