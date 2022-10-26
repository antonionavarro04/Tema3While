// TESTS
// = Habra que comprobar que la división entre 0 no de error
// = HHabráque comprobar que las operaciones se realizcn correctamente (DEBUG)

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio5 {
    public static void main(String[] args) {
        // ? Programa el cual pida 10 numeros al usuario, cuando acabe mostrará la suma de los numeros positivos, la media de los negativos y la cantidad de ceros introducidos
        // ^ Declaramos la variable num, resultadoPositivos, resultadoNegativos, contadorNegativos, contadorCeros y contadorWhile
        long num = 0, resultadoPositivos = 0, resultadoNegativos = 0;
        byte contadorCeros = 0, contadorWhile = 0, contadorNum = 1, contadorNegativos = 0;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.println("Introduce 10 numeros: ");

        // ! Bucle While
        while (contadorWhile != 10){
            // ! Pedimos el numero
            System.out.print("[" + contadorNum + "] " + "-> ");
            num = read.nextLong();

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
            contadorNum++;
        }

        // ? Triple salto de Linea
        System.out.println();System.out.println("---------------------------------------");System.out.println();

        // ! Mostramos el resultado al usuario 
        System.out.println("La suma de los numeros positivos es de: " + resultadoPositivos); // * Suma de los positivos
        System.out.println("La media de los numeros negativos es de: " + (resultadoNegativos / contadorNegativos)); // * Media de los negativos
        System.out.println("La cantidad de ceros introducidos es de: " + contadorCeros); // * Cantidad de ceros

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
