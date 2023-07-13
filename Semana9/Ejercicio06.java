package Semana9;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        // Ingresar 10 números enteros y mostrar los números pares.

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 numeros");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite el numero " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
        }

        scanner.close();

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("El numero " + numeros[i] + " es par.");
            }
        }
    }
}
