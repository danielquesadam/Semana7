package Semana9;

import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        // Ingresar por teclado 5 notas y mostrar el promedio.

        Scanner scanner = new Scanner(System.in);

        double sumaNotas = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            sumaNotas += nota;
        }
        scanner.close();
        
        double promedio = sumaNotas / 5;

        System.out.println("El promedio de las notas es: " + promedio);
    }
}
