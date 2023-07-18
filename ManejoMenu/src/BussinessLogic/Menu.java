package BussinessLogic;

import java.util.Scanner;
import Common.Mesa;
import Common.Cliente;

//Es la clase encargada de manejar el menu y las diferentes opciones o operaciones del sistema.
//Es decir es la clase orquestadora del sistema
public class Menu {

    private Mesa[] vgArregloDeMesas = new Mesa[10];
    final String vgEstadoDisponible = "Disponible";
    final String vgEstadoReservada = "Reservada";

    // Constructor de la clase
    // El constructor siempre se llama igual que la clase
    // Y definir como va a iniciar la clase
    // Es el primer metodo que se ejecuta cuando se crea una instancia de la clase
    public Menu() {// Inicio constructor
        login();

    }// Fin de constructor

    // Metodo para mostrar las opciones del menu en pantalla
    /**
     * 
     */
    public void MostrarOpciones() {

        // Paso 1. Vamos a crear una instancia de la libreria Scanner para interactuar
        // con la terminal
        // Se le pasa como parametro al constructor de Scanner System.in para indicar
        // que solo deseamos
        // Obtener los valores que ingresa el usuario
        Scanner entrada = new Scanner(System.in);

        // Paso 2. Vamos a crear una variable que almacene la opcion seleccionada o
        // ingresada por el usuario
        int opcion;

        // Paso 3. Vamos a crear un ciclo do-while
        do {// Inicio del do

            // Paso 4. Vamos a mostrar las opciones que estan permitidas para el usuario
            // Utilizamos System.out.println
            System.out.println("***Menu***");
            System.out.println("1. Opcion 1.");
            System.out.println("2. Opcion 2.");
            System.out.println("3. Opcion 3.");
            System.out.println("4. Salir.");
            System.out.print("Elija una opcion:");

            // Paso 5. Vamos a asignar a la variable opcion que es de tipo in el valor que
            // ingreso el usuario, es decir, la opcion seleccionada
            // El valor seleccionado por el usuario lo obtenemos haciendo un llamado al
            // metodo nextInt() de la clase Scanner que retorna el proximo valor de tipo
            // int ingresado por el usuario
            opcion = entrada.nextInt();

            // Paso 6. Vamos a definir un switch es un manejador de opciones un poco mas
            // flexible que los if o else
            // Recibe un parametro, en este caso la variable opcion que almacena la opcion
            // seleccionada
            // Y se pueden crear dentro del switch diferentes casos, los casos son como las
            // opciones que el switch maneja para un valor en particular
            // Los casos son escenarios para opciones establecidas
            // Existe un escenario default que va a capturar todas las opciones no manejadas
            // por el switch
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la opcion 1");
                    break;
                case 2:
                    System.out.println("Has seleccionado la opcion 2");
                    // Agrega el codigo correspondiente a la opcion 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion 3");
                    // Agrega el codigo correspondiente a la opcion 3
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    // Agrega el codigo correspondiente a la opcion 4
                    break;
                default:
                    System.out.println("Opcion invalida. Intentalo de nuevo");
                    break;
            }// Finaliza switch
            System.out.println();// Salto de linea
        } // Fin del do
          // Agregamos la condicion logica que indica si el ciclo debe continuar o
          // finalizar
        while (opcion != 4);
        entrada.close();
    }// Fin

    public void Saludar() {
        System.out.println("Hola.");
    }

    public void login() {

        // Se le pasa cero parametro al constructor de Scanner System.In para indicar
        // que solo deseamos
        // obtener los valores que ingresa el usuario

        Scanner entrada = new Scanner(System.in);

        // Solicitar los valores al usuario

        String vlUsuario = "";
        String vlPass = "";
        System.out.println("Por favor ingrese sus credenciales");
        System.out.println("Ingrese su usuario");
        vlUsuario = entrada.next();
        System.out.println("Por favor ingrese su contrasena");
        vlPass = entrada.next();

        Seguridad vlSeguridad = new Seguridad();

        Boolean vlResultado = vlSeguridad.buscarPorUsuarioClave(vlUsuario, vlPass);

        if (vlResultado) {
            System.out.println("Bienvenido.");
            MostrarOpciones();
        } else {
            System.out.println("Credenciales incorrectas.");
        }

        // Todas mis mesas van a tener 4 espacios.
    public void inicializarMesas() {
        //todas mis mesas van a tener 4 espacios
        for(int indice = 0; vgArregloDeMesas > indice; indice++){
            vgArregloDeMesas[indice] = new Mesa(Indice + 1, vpCantidadSillas:4);
        }
    }
//Crear un metodo
    public void getMesasPorEstado(String vpEstado){
        System.out.println("Lista de mesas: " + vpEstado);

        for(int indice = 0; vgArregloDeMesas.lengt > indice; indice++) {
            String vlEstado = vgArregloDeMesas[indice].getVgEstado();

            if (vlEstado.equals(vpEstado)) {
                System.out.println("Mesa #" + vgArregloDeMesas[indice].getNumeroDeMesa());
            }
        }
    }

    public void reservarMesa(Cliente vpCliente, int vpNumeroMesa, String vpFecha, String vpHora){

        for (int indice = 0; vgArregloDeMesas.lengt > indice; indice ++)

        if (vgArregloDeMesas[indice]).getvgNumeroDeMesa() == vpNumeroMesa && vgArregloDeMesas[indice].getVgEstado().equals("Disponible")){
            System.out.println("La mesa #" + vpNumeroMesa + ", fue reservada de forma exitosa!");
        
            //Paso cambiar el estado de la mesa reservada.

            return;
        }

    }        

        entrada.close();

    }
}
