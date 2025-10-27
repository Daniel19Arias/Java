import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        //Utilizamos dos escáners, uno para la altura y otro para el peso
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe a continuación la altura en m: ");
        float altura = scanner.nextFloat();
        System.out.print("\nEscribe a continuación su peso en KG: ");
        float peso = scanner.nextFloat();
        float calcAltura = altura * altura;
        float IMC = peso / calcAltura;
        //Formateamos el IMC
        String imcFormateado = String.format("%.2f", IMC);

        //Realizamos las condiciones
        if (IMC <= 18.5){
            System.out.println("Tu IMC es "+imcFormateado+". Por lo tanto es muy bajo");
        } else if (IMC >= 18.25 && IMC <25) {
            System.out.println("Tu IMC es "+imcFormateado+". Por lo tanto es bajo");
        } else if (IMC >= 25 && IMC <=30) {
            System.out.println("Tu IMC es "+imcFormateado+". Por lo tanto es normal");
        } else if (IMC > 30) {
            System.out.println("Tu IMC es "+imcFormateado+". Por lo tanto es Alto");
        }
    }
}