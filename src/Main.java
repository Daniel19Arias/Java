/*Desarrolla un programa en java que simule el calculo de intereses simples y genere un reporte financiero completo.
Crea una clase principal con el metodo main. declara las variables necesarias de tipo String y double, y aplica cálculos secuenciales para
obtener los intereses generados, el capital final y el interés mensual promedio.
Muestra todos los resultados formateados con dos decimales usando System.out.prinf e incluye un encabezado con el nombre del inversionista
y sus datos del cálculo. Comenta las lineas mas importantes explicando la funcion de cada variable y operación. Todo el codigo debe estar
bien estructuado, ordenado y con nombres de variables bien claros
 */
import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba su nombre a continuación: ");
        String nombre = scanner.nextLine();
        System.out.print("\nEscriba su capital inicial: ");
        double capital = scanner.nextDouble();
        System.out.print("\nEscriba el porcentaje de tasa anual(%): ");
        double tasa = scanner.nextDouble();
        System.out.print("\nEscriba cuál es el tiempo de inversion: ");
        int tiempo = scanner.nextInt();
        System.out.println("-----------------------------------------");
        System.out.println("Sus datos son los siguientes\nNombre: "+nombre+"\nCapital Inicial: "+capital+"\nTasa: "+tasa+"\nTiempo de inversión: "+tiempo);
        System.out.println("-----------------------------------------");
        double interesGenerado = capital * (tasa/100) * tiempo;
        double capitalFinal = capital + interesGenerado;
        double interesPromedio = interesGenerado / (tiempo*12);
        System.out.println("Buenas "+nombre+ " sus datos son los siguientes");
        System.out.printf("Su interes generado es el siguiente: %.2f",interesGenerado);
        System.out.printf("\nCapital Final: %.2f",capitalFinal);
        System.out.printf("\nSu interes promedio es: %.2f",interesPromedio);
    }
}