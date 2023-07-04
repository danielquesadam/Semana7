package Common;

//Descripcion: Esta clase tiene la definicion del objeto del cliente.
//A traves de class defines metodos y prioridades de un objeto.

public class Cliente {
    // Paso 1. Definir los atributos. Los atributos son representados con variables
    // VG variable globar. VP variable por parametro
    private String vgNombre;
    private String vgApellido;
    private String vgIdentificacion;
    private String vgTelefono;

    // Paso 2. Constructor
    public Cliente(String vpNombre, String vpApellido, String vpIdentificacion, String vpTelefono) {
        // 2.1 Asignamos los valores recibidos por parametros a nuestros atributos
        // globales.

        vgNombre = vpNombre;
        vgApellido = vpApellido;
        vgIdentificacion = vpIdentificacion;
        vgTelefono = vpTelefono;
    }

    public String getVgNombre() {
        return vgNombre;
    }

    public void setVgNombre(String vgNombre) {
        this.vgNombre = vgNombre;
    }

    public String getVgApellido() {
        return vgApellido;
    }

    public void setVgApellido(String vgApellido) {
        this.vgApellido = vgApellido;
    }

    public String getVgIdentificacion() {
        return vgIdentificacion;
    }

    public void setVgIdentificacion(String vgIdentificacion) {
        this.vgIdentificacion = vgIdentificacion;
    }

    public String getVgTelefono() {
        return vgTelefono;
    }

    public void setVgTelefono(String vgTelefono) {
        this.vgTelefono = vgTelefono;
    }

}
