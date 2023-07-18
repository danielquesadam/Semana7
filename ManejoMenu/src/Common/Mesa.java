package Common;

//Definimos los atributos que salen para representarlos con variables
public class Mesa {
    public int vgNumeroDeMesa;
    public int vgCantidadDeSillas;
    public String vgEstado;

    //Constructor

    public Mesa(){
        vgNumeroDeMesa = 0;
        vgCantidadDeSillas = 0;
        vgEstado = "Disponible";
    }

    public Mesa(int vpNumeroMesa, int vpCantidadSillas){
        vgNumeroDeMesa = vpNumeroMesa;
        vgCantidadDeSillas = vpCantidadSillas;
        vgEstado = "Disponible";
    }
}
