package Semana9;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        // Crear un arreglo, que nos pida ingresar una palabra, para mostrarlo letra por
        // letra y la suma de sus caracteres.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();
        scanner.close();

        char letras[] = palabra.toCharArray();

        System.out.println("Letras de la palabra:");

        for (char letra : letras) {
            System.out.println(letra);
        }

        int cantidadLetras = palabra.length();
        System.out.println("La cantidad de letras en la palabra " + palabra + " es : " + cantidadLetras);
    }
}
