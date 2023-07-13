package Semana9;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // Ingresar por teclado 10 números en un arreglo y mostrar el numero mayor y el
        // numero menor.

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.println("Digite 10 numeros");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Digite el numero " + (i + 1) + " :");
            numeros[i] = scanner.nextInt();
        }
        scanner.close();

        int mayor = numeros[0];
        int menor = numeros[0];

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
    }
}
