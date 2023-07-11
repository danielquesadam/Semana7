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

        System.out.println("Curso: " + nombresCursos[0] + "   Nota: "+ notas[0]);
        System.out.println("Curso: " + nombresCursos[1] + "   Nota: "+ notas[1]);
        System.out.println("Curso: " + nombresCursos[2] + "   Nota: "+ notas[2]);

        scanner.close();

        System.out.println("El promedio de notas de los 3 cursos es: " + promedio);

        // Paso 1 crear arreglo de cursos

        // Paso 2 crear arreglo de notas

        // Paso 3 calcular el promedio: la suma de las notas dividido entre la cantidad
        // de cursos
        // int suma = notas[0] + notas[1] + notas[2];
        // int promedio = suma/3;

        // int acumuladoraSuma = 0;
        // for
        // acumuladoraSuma = acumuladoraSuma + notas[indice];
        // for

        // Paso 4 mostrar la nota y el promedio de cada curso.

        // Ejemplo de salida de informacion:
        // Promedio de Cursos

        // CURSO NOTA
        // ----- ----

        // FOR
        // Diseño 85
        // Ingles 80
        // Mate 100
        // FOR

        // El promedio es de: 88.33
    }
}
