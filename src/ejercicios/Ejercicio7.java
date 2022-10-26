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
        final int resultado = (int) (Math.random() * 100) + 1;
        int resultadoUsuario = 0;
        long intentos = 0;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pequeña presentación del Juego
        System.out.println("Bienvenido al juego 'el número secreto'");
        System.out.println("Una vez presiones 'enter' se generará un número aleatorio del 1 al 100");
        System.out.println("Tendrás que adivinarlo, si el número es mayor te lo dirá y si es menor también");
        System.out.println("Cuando lo adivines el programa terminará");
        System.out.println("Si introduces -1 el programa terminará y te habras rendido");
        System.out.println("¡Buena Suerte!");
        System.out.println();
        System.out.println("Presiona 'enter' para comenzar");

        // ! Pulsar enter para empezar
        read.nextLine();

        // ? Triple salto de Linea
        System.out.println();System.out.println("---------------------------------------");System.out.println();

        // ! Bucle While
        while (resultado != resultadoUsuario){
            // ! Pedimos el numero
            System.out.print("Introduce un número: ");
            resultadoUsuario = read.nextInt();

            // ! Agregamos un intento
            intentos++;
            
            // ! Comprobamos si es mayor o menor. Tambien puede haberlo acertado a la primera o haberse rendido
            if (resultadoUsuario == -1){ // * Si se rinde
                // ! Decrementamos los intentos en 1, ya que la rendicion no cuenta como intento
                intentos--;

                // ? Doble salto de Linea
                System.out.println("---------------------------------------");System.out.println();

                // ! Mostramos el fin del Programa
                System.out.println("Te has rendido, el número era: " + resultado + ". Hiciste " + intentos + " intentos");

                // ! Igualamos el resultado para que el programa se acabe
                resultadoUsuario = resultado;
            } else if (resultadoUsuario > resultado){ // * Si es mayor
                System.out.println("El numero " + resultadoUsuario + " es mayor que el numero a adivinar");
            } else if (resultadoUsuario < resultado){ // * Si es menor
                System.out.println("El numero " + resultadoUsuario + " es menor que el numero a adivinar");
            } else { // * Si es igual
                // ? Triple salto de Linea
                System.out.println();System.out.println("---------------------------------------");System.out.println();
                
                // ! Imprimimos que ha ganado y los intentos que le ha llevado a encontrar el numero
                System.out.println("Has acertado el numero!!!");
                System.out.println("Lo has adivinado en " + intentos + " intentos");
            }

            // ? Salto de linea
            System.out.println();
        }

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
