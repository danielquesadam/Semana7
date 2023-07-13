package Semana9;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        // Ingresar por teclado n cantidad de números y ordenarlos en forma ascendente.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números a ordenar: ");
        int cantidadNumeros = scanner.nextInt();

        int[] numeros = new int[cantidadNumeros];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero #: " + (i + 1));
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        // Algoritmo de ordenamiento de burbuja

        for (int i = 0; i < cantidadNumeros - 1; i++) {
            for (int j = 0; j < cantidadNumeros - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Intercambiar los elementos si están en orden incorrecto
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Números ordenados en forma ascendente:");

        for (int i = 0; i < cantidadNumeros; i++) {
            System.out.println(numeros[i]);
        }
    }
}