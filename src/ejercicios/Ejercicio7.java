// TESTS
// = Deberemos comprobar introduciendo un número fuera de rango

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio7 {
    public static void main(String[] args) {
        // ? Programa el cual genere un numero aleatorio del 1 al 100, el usuario tendráque adivinarlo y el programa le dirá si el numero es mayor o menor, cuando lo adivine el programa terminará
        // ^ Declaramos la variable resultado y resultadoUsuario
        final int resultado = (int) (Math.random() * 100 + 1);
        int resultadoUsuario = 0;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pequeña presentación del Juego
        System.out.println("Bienvenido al juego 'el número secreto'");
        System.out.println("Una vez presiones 'enter' se generará un número aleatorio del 1 al 100");
        System.out.println("Tendrás que adivinarlo, si el número es mayor te lo dirá y si es menor también");

        // ! Bucle While
        while (resultado != resultadoUsuario){
            // ! Pedimos el numero
            System.out.print("Introduce un número: ");
            resultadoUsuario = read.nextInt();

            // ? Salto de linea
            System.out.println();

            // ! Comprobamos si es mayor o menor. Tambien puede haberlo acertado a la primera
            if (resultadoUsuario > resultado){ // * Si es mayor
                System.out.println("El numero " + resultadoUsuario + " es mayor que el numero a adivinar");
            } else if (resultadoUsuario < resultado){ // * Si es menor
                System.out.println("El numero " + resultadoUsuario + " es menor que el numero a adivinar");
            } else { // * Si es igual
                // ? Doble salto de Linea
                System.out.println("---------------------------------------");System.out.println();

                System.out.println("Has acertado el numero");
            }
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
