// TESTS
// = Deberemos comprobar que Cuenta bien a los Alumnos mayores y totales
// = Deberemos comprobar que hace bien la media y la suma
// = Deberemos comprobar que hace el programa si no introducimos ninuna edad

package ejercicios;

// ? Importamos la clase Scanner y Locale
import java.util.Scanner;
import java.util.Locale;

public class Ejercicio6 {
    public static void main(String[] args) {
        // ? Programa el cual pida las edades de los alumnos, tras introducir un numero negativo mostrará la suma de las edades, la media, el nº de alumnos y cuantos son mayores de edad
        // ^ Declaramos la variable edad, resultado, contadorAlumno, contadorMayor
        byte edad = 0;
        long contadorAlumno = -1, contadorMayor = 0, resultado = 0;
        
        // ^ Creamos el Scanner en la variable read y lo cambiamos al formato US
        Scanner read = new Scanner(System.in);
        read.useLocale(Locale.US);

        // ! Pedimos la edad al usuario
        System.out.println("Introduce las edades de los alumnos: ");

        // ! Bucle While
        while (edad >= 0){
            // ! Incrementamos el contador de los Alumnos
            contadorAlumno++;

            // ! Comprobamos la edad del Alumno, de ser mayor de edad incrementaremos el contador de los mayores
            if (edad >= 18) contadorMayor++;

            // ! Sumamos las edades
            resultado += edad;
            
            // ! Pedimos las edades al usuario
            System.out.print("-> ");
            edad = read.nextByte();
        }

        // ? Triple salto de Linea
        System.out.println();System.out.println("---------------------------------------");System.out.println();

        // ! Mostramos los resultados
        System.out.println("La suma de todas las edades es: " + resultado); // * Suma de las edades
        System.out.println("La media de las edades es: " + (resultado / contadorAlumno)); // * Media de las edades
        System.out.println("En el centro hay " + contadorAlumno + " alumnos, de los cuales " + contadorMayor + " alumnos son mayores de edad"); // * Cantidad total de alumnos y mayores de edad

        // ^ Cerramos el Scanner
        read.close();

        // € Hecho por Antonio Navarro
    }
}
