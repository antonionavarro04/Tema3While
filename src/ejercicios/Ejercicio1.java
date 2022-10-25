// TESTS
// = 

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {
        // ? programa que pida numeros positivos al usuario y los vaya sumando, en el momento que introduzca un numero negativo se acabará el programa y se mostrará la suma total de todos los numeros introducidos
        // ^ Creamos la variable num y resultado
        int num = 0, resultado = 0;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Havemos el bucle While
        while (num >= 0){
            // ! Sumamos el numero
            resultado += num;
            // ! Pedimos el numero
            System.out.print("Introduce un número a sumar: ");
            num = read.nextInt();

        }

        // ? Triple salto de Linea
        System.out.println();System.out.println("---------------------------------------");System.out.println();

        // ! Mostramos el resultado al usuario
        System.out.println("La suma total es de: " + resultado);

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
    
}
