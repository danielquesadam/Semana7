package Semana9;

public class Ejercicio02 {
    public static void main(String[] args) {
        // En un arreglo, mostrar los datos de un usuario ( nombre, edad y sexo).

        String nombres[] = { "Jose", "Daniel", "Esteban" };
        String edad[] = { "27", "28", "21" };
        String genero[] = { "Masculino", "Masculino", "Masculino" };

        System.out.println("Los datos de los usuarios son:");

        for (int indice = 0; nombres.length > indice; indice++) {
            System.out.println(nombres[indice] + " " + edad[indice] + " " + genero[indice]);
        }
    }
}