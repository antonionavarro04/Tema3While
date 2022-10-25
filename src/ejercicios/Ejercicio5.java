// TESTS
// = 

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa el cual pida 10 numeros al usuario, cuando acabe mostrará la suma de los numeros positivos, la media de los negativos y la cantidad de ceros introducidos
        // ^ Declaramos la variable num, resultadoPositivos, resultadoNegativos, contadorNegativos, contadorCeros y contadorWhile
        long num = 0, resultadoPositivos = 0;
        double resultadoNegativos = 0, contadorNegativos = 0;
        byte contadorCeros = 0, contadorWhile = 0;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Bucle While
        while (contadorWhile != 10){
            // ! Pedimos el numero
            System.out.print("Introduce un número: ");
            num = read.nextInt();

            // ! Comprobamos si el numero es positivo, negativo o cero
            if (num == 0){ // * Si el numero es 0
                // ! Incrementamos el contador de ceros
                contadorCeros++;
            } else if (num > 0){ // * Si el numero es positivo
                // ! Sumamos el numero
                resultadoPositivos += num;
            } else { // * Si el numero es negativo
                // ! Sumamos los negativos
                resultadoNegativos += num;
                // ! Incrementamos el contador de negativos
                contadorNegativos++;
            }

            // ! Incrementamos el contadorWhile
            contadorWhile++;
        }

        // ? Triple salto de Linea
        System.out.println();System.out.println("---------------------------------------");System.out.println();

        // ! Mostramos el resultado al usuario 
        System.out.println("La suma de los numeros positivos es de: " + resultadoPositivos);
        System.out.println("La media de los numeros negativos es de: " + (resultadoNegativos / contadorNegativos));
        System.out.println("La cantidad de ceros introducidos es de: " + contadorCeros);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
