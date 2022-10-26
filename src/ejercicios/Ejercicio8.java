// TESTS
// = Habra que comprobar saliendo directamente de la aplicación

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio8 {
    public static void main(String[] args) {
        // ? Programa el cual pida alturas de Árboles hasta que el usuario introduzca -1, en ese momento el programa dirá cuál es el arbol mas grande
        // ^ Declaramos la variable altura, contadorWhile, arbolMasGrande
        long altura = 0, contadorWhile = 1, arbolMasGrande = 0, arbolMasGrandeAltura = 0;

        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos el numero al usuario
        System.out.println("Introduce la altura del árbol: ");

        // ! Bucle While
        while (altura != -1){
            // ! Pedimos el numero
            System.out.print("[" + contadorWhile + "] " + "-> ");
            altura = read.nextLong();

            
            // ! Comprobamos si es par o impar
            if (altura == -1){
                // ? Triple salto de Linea
                System.out.println();System.out.println("---------------------------------------");System.out.println();
                
                // ! Comprabamos si a introducido algun arbol
                if (contadorWhile == 1){ // * Si no ha introducido ningun arbol
                    System.out.println("No has introducido ningún árbol");
                } else { // * Si ha introducido al menos un arbol
                    System.out.println("El árbol mas grande es el número " + arbolMasGrande + " con una altura de " + arbolMasGrandeAltura + " cm");
                }
            } else if (altura > arbolMasGrandeAltura){
                // ! Cambiamos el valor de arbolMasGrande
                arbolMasGrande = contadorWhile;
                arbolMasGrandeAltura = altura;
            }

            // ! Incrementamos el contador
            contadorWhile++;
        }

        // ^ Cerramos el Scanner
        read.close();
        
        // € Hecho por Antonio Navarro
    }
}
