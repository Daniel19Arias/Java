public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 1");
        System.out.println("--------------------------------------------");
        int edad = 17;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad, tienes " + edad + " años");
        } else {
            System.out.println("Eres menor de edad, tienes " + edad + " años");
        }

        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio 2");
        System.out.println("--------------------------------------------");
        int temp = 10;
        if (temp >= 0 && temp <= 10) {
            System.out.println("Hace " + temp + " grados, hace frío");
        } else if (temp > 10 && temp <= 24) {
            System.out.println("Se calienta la cosa, hace " + temp + " grados");
        } else {
            System.out.println("Hace to la caloh, estamos a " + temp + " grados");
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio 3");
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= 18; i++) {
            System.out.println("Número " + i);
            i += 2; //Para que sume de dos en dos, que agregandole al declarado en el bucle suma 3
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ejercicios para práctica");
        System.out.println("--------------------------------------------");
        /* Ejercicio 1
        En funcion de la nota obtenida en clase, muestra en pantalla lo siguiente:
        Nota >= 9, muestra sobresaliente,
        Nota >=7, muestra notable,
        Nota >=5, muestra aprobado,
        Nota <5, muestra suspenso.

        Ejercicio 2
        Mostrar en pantalla los numeros pares del 1-100, empezando con el 1.

        Ejercicio 3
        Mostrar en pantalla los números impares del 500 al 400 empezando por 500.
         */

        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio 1 (Práctica)");
        System.out.println("--------------------------------------------");
        //Ejercicio 1
        int nota = -20;

        if (nota >= 9 && nota <=10) {
            System.out.println("Tu nota es " + nota + " por lo tanto tienes un sobresaliente");
        } else if (nota >= 7 && nota < 9) {
            System.out.println("Tu nota es " + nota + " por lo tanto tienes un notable");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Tu nota es " + nota + " por lo tanto tienes un aprobado");
        } else if (nota >=0 && nota <5) {
            System.out.println("Tu nota es " + nota + " por lo tanto tienes un suspenso");
        } else {
            System.out.println("Nota incorrecta");
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio 2 (Práctica)");
        System.out.println("--------------------------------------------");
        //Ejercicio 2
        for (int num = 1; num <=100; num++){
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
        System.out.println("--------------------------------------------");
        System.out.println("Ejercicio 3 (Práctica)");
        System.out.println("--------------------------------------------");
        //Ejercicio 3
        for (int n = 500; n>=400;n--){
            if (n % 2 !=0){
                System.out.println(n);
            }
        }

    }
}