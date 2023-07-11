import BussinessLogic.Menu;

//Que es la clase APP es la que inicia nuestra aplicacion
public class App {
    public static void main(String[] args) {
        // Paso 1. Vamos a definir la clase manejadora del sistema para que sea la
        // primera en ejecutarse */
        // Para esto creamos una instancia de la clase Menu
        new Menu();
    }
}