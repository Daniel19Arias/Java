import java.util.Random;
import java.util.Scanner;

public class Primer_Ejercicio_De_Java {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true) {
            System.out.println("Bienvenido al programa");
            System.out.println("Seleccione una opción");
            System.out.println("1. Calcular el IVA");
            System.out.println("2. Mostrar números pares");
            System.out.println("3. Generar número aleatorio");
            System.out.println("4. Salir");
            int opcion = scanner.nextInt();
            if (opcion == 1) {
                System.out.println("De que numero quieres calcular el IVA (21%)");
                double numero = scanner.nextDouble();
                double resultado = numero * 0.21;
                System.out.println("El resultado del IVA es " + resultado);
            } else if (opcion == 2) {
                System.out.println("Mostrando números pares hasta el 10");
                for (int i = 0; i <= 10; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
            } else if (opcion == 3) {
                System.out.println("Generando un número aleatorio entre 1-10");
                int rand = random.nextInt(10);
                System.out.println("Su número aleatorio es " + rand);
            } else if (opcion == 4) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Número no valido. Seleccione uno valido");
            }
        }
    }
}
