package BussinessLogic;

import Common.Usuario;

public class Seguridad {
    public Seguridad(){
    registroDeUsuarios ();
}

    // Definir las variables globales
    public Usuario[] arregloUsuarios = new Usuario[5];

    // Metodo para cargar usuarios en el sistema
    public void registroDeUsuarios() {

        // Paso 1 crear una instancia de la clase usuario
        Usuario usuarioAdmin = new Usuario();
        usuarioAdmin.setVgNombreDeUsuario("Admin");
        usuarioAdmin.setVgPassword("123");

        Usuario usuarioClienteJohn = new Usuario("John", "123");
        Usuario usuarioClienteJose = new Usuario("Jose", "123");
        Usuario usuarioClienteDali = new Usuario("Dali", "123");
        Usuario usuarioClienteMaria = new Usuario("Maria", "123");

        // Paso 2 agregar al arreglo la instancia del usuario admin

        // Posicion del arreglo
        arregloUsuarios[0] = usuarioAdmin;
        arregloUsuarios[1] = usuarioClienteJohn;
        arregloUsuarios[2] = usuarioClienteJose;
        arregloUsuarios[3] = usuarioClienteDali;
        arregloUsuarios[4] = usuarioClienteMaria;

    }

    // Bucle For
    // Se declara un metodo llamado buscarUsuarioPorClave que tenga dos
    // parametros
    // vpUsuario y vpClave
    // Tambien se utiliza la variable global arregloUsuarios
    // Que es el arreglo de Usuario en el que se realizara la busqueda

    public boolean buscarPorUsuarioClave(String vpUsuario, String vpClave){
        for (int indice = 0; indice < arregloUsuarios.length; indice++){
            String vlUsuario = arregloUsuarios[indice].getVgNombreDeUsuario();
            String vlClave = arregloUsuarios[indice].getVgPassword()
            if (vlClave.equals(vpClave) && vlUsuario.equals(vpUsuario)){
                return true;
            }
        }
        return false;
    }
}
