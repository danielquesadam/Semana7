package Common;

//Descripcion: Esta clase tiene la definicion del objeto del cliente.
//A traves de class defines metodos y prioridades de un objeto.

public class Cliente {
    // Paso 1. Definir los atributos. Los atributos son representados con variables
    // VG variable globar. VP variable por parametro
    /*
     * 1. Convenciones de nomenclatura: Java utiliza el estilo de nomenclatura
     * denominado "camel case" para las variables.
     * Esto significa que el nombre de la variable debe comenzar con una letra
     * minúscula, y si consta de varias palabras,
     * las palabras siguientes deben comenzar con una letra mayúscula. Por ejemplo:
     * nombre, numeroDeTelefono, cantidadTotal, etc.
     * 
     * 2. Claridad y significado: Los nombres de las variables deben ser
     * descriptivos y reflejar el propósito o la función
     * de la variable en el código. Esto ayuda a que el código sea más legible y
     * comprensible para otros desarrolladores.
     * Evita nombres ambiguos o demasiado genéricos, como x, temp, variable1, etc.
     * En su lugar, elige nombres más significativos,
     * como edad, nombreCompleto, totalVentas, etc.
     * 
     * 3. Evitar palabras clave: No puedes utilizar palabras clave reservadas de
     * Java como nombres de variables, ya que estas palabras
     * tienen un significado especial en el lenguaje y se utilizan para funciones
     * específicas. Por ejemplo, no puedes utilizar int, class, public, etc., como
     * nombres de variables.
     * 
     * 4. Uso de caracteres válidos: Los nombres de variables en Java solo pueden
     * contener letras (mayúsculas y minúsculas), dígitos y
     * el carácter de subrayado (_). Además, el primer carácter de un nombre de
     * variable no puede ser un dígito.
     * 
     * 5. Evitar nombres demasiado largos: Si bien es importante que los nombres de
     * las variables sean descriptivos,
     * también debes tener en cuenta que nombres excesivamente largos pueden
     * dificultar la legibilidad del código.
     * Intenta encontrar un equilibrio entre la claridad y la concisión.
     */
    private String vgNombre;
    private String vgApellido;
    private String vgIdentificacion;
    private String vgTelefono;

    // Paso 2. Constructor
    /*
     * Un método constructor en Java es un tipo especial de método que se utiliza
     * para crear e
     * inicializar objetos de una clase específica. Su propósito principal es
     * asignar valores iniciales a los miembros de un objeto cuando se crea una
     * instancia de esa clase.
     */

    /*
     * 1. Creación de objetos: Los objetos se crean utilizando la palabra clave new
     * seguida del nombre del constructor. El constructor se invoca automáticamente
     * cuando se crea un nuevo objeto. Por ejemplo: MiClase objeto = new MiClase();
     * 
     * 2. Nombre coincidente con la clase: Un método constructor tiene el mismo
     * nombre
     * que la clase en la que se encuentra. No tiene un tipo de retorno explícito,
     * ni siquiera void. Esto ayuda a diferenciarlo de otros métodos de la clase.
     * 
     * 3. Inicialización de variables: El método constructor se utiliza para asignar
     * valores iniciales a las variables de instancia de la clase. Puede recibir
     * parámetros que proporcionan los valores iniciales, y estos valores se
     * utilizan para inicializar las variables correspondientes.
     */

    /*
     * Sobrecarga de constructores: Puedes definir múltiples constructores en una
     * clase, cada uno con una lista de parámetros diferente. Esto se conoce como
     * sobrecarga de constructores. Permite crear objetos de una clase con
     * diferentes configuraciones iniciales según los constructores disponibles.
     * 
     * Constructor por defecto: Si no se define ningún constructor en una clase,
     * Java proporciona automáticamente un constructor por defecto sin parámetros.
     * Este constructor inicializa las variables con valores predeterminados (0 para
     * tipos numéricos, false para tipos booleanos, null para referencias de
     * objetos, etc.).
     * 
     * El uso de métodos constructores en Java es esencial para la creación de
     * objetos y la inicialización de variables. Proporcionan una forma estructurada
     * y consistente de configurar objetos con valores iniciales, lo que contribuye
     * a la encapsulación y la correcta utilización de las clases.
     */
    public Cliente(String vpNombre, String vpApellido, String vpIdentificacion, String vpTelefono) {
        // 2.1 Asignamos los valores recibidos por parametros a nuestros atributos
        // globales.

        vgNombre = vpNombre;
        vgApellido = vpApellido;
        vgIdentificacion = vpIdentificacion;
        vgTelefono = vpTelefono;
    }

    // Paso 3. Get y Set
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
