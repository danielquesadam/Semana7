package Semana9;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {

        // Mostrar el promedio de notas de tres cursos
        Scanner scanner = new Scanner(System.in);

        String[] nombresCursos = new String[3];
        double[] notas = new double[3];

        for (int i = 0; i < nombresCursos.length; i++) {
            System.out.println("Ingrese el nombre del curso " + (i + 1) + ": ");
            nombresCursos[i] = scanner.nextLine();

            System.out.print("Ingrese la nota del curso " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        double suma = notas[0] + notas[1] + notas[2];
        double promedio = suma / 3;

        System.out.println("Curso: " + nombresCursos[0] + "   Nota: " + notas[0]);
        System.out.println("Curso: " + nombresCursos[1] + "   Nota: " + notas[1]);
        System.out.println("Curso: " + nombresCursos[2] + "   Nota: " + notas[2]);

        scanner.close();

        System.out.println("El promedio de notas de los 3 cursos es: " + promedio);
    }
}
