package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio4 {
    public static void main(String[] args) {
        // ? Programa el cual pida numeros positivos y negativos y muestre si son par o impar, una vez introudzca 0 se acabará el programa
        // ^ Declaramos la variable num
        int num = 1;
        
        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Bucle While
        while (num != 0){
            // ! Pedimos el numero
            System.out.print("Introduce un número: ");
            num = read.nextInt();

            // ! Comprobamos si es par o impar
            if (num == 0){
                // ? Triple salto de Linea
                System.out.println();System.out.println("---------------------------------------");System.out.println();
                
                // ! Mostramos el fin del Programa
                System.out.println("Fin del Programa");
            } else if (num % 2 == 0){
                System.out.println("El numero " + num + " es par");
            } else {
                System.out.println("El numero " + num + " es impar");
            }
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
