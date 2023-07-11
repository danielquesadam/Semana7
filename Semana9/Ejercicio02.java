package Semana9;

public class Ejercicio02 {
    public static void main(String[] args) {
        // .En un arreglo, mostrar los datos de un usuario ( nombre, edad y sexo).

        String nombres[] = { "Jose", "Daniel", "Esteban" };
        String edad[] = { "27", "28", "21" };
        String genero[] = { "Masculino", "Masculino", "Masculino" };

        System.out.println("Los datos de los usuarios son:");

        for (int indice = 0; nombres.length > indice; indice++) {
            System.out.println(nombres[indice] + " " + edad[indice] + " " + genero[indice]);
        }
    }
}

// Paso 1 crear una clase persona.

// Paso 2 crear una instancia de la clase persona y asignar sus propiedades

// Paso 3 crear un arreglo de Personas

// Paso 4 asignar la persona a la primer posicion del arreglo

// Paso 5 mostrar la informacion de la posicion 0

// 1 Crear la clase persona
