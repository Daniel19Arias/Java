public class Main {
    public static double sumar (double a, double b, double c){
        double bcuadrado = b*b;
        double cuatroac = 4*a*c;
        double dosa = 2*a;
        double raiz = Math.sqrt(bcuadrado-cuatroac);
        double numeradorpos = (-b+raiz);
        double frac = (numeradorpos/dosa);
        return (numeradorpos/dosa);
    }
    public static double restar (double a, double b, double c){
        double bcuadrado = b*b;
        double cuatroac = 4*a*c;
        double dosa = 2*a;
        double raiz = Math.sqrt(bcuadrado-cuatroac);
        double numeradorneg = (-b-raiz);
        double frac = (numeradorneg/dosa);
        return (numeradorneg/dosa);
    }
    public static void main (String[] args){
        double resultado = sumar(2,5,2);
        System.out.printf("Valor de la ecuación positiva es: %.2f",resultado);
        System.out.println("\n--------------------------------------------");
        double resultado_Resta = restar(2,5,2);
        System.out.printf("Valor de la ecuación negativa es: %.2f%n",resultado_Resta);
    }
}