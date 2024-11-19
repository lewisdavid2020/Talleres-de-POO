public class Estudiante {
    private String nombre; // Propiedad para el nombre del estudiante
    private int edad;      // Propiedad para la edad del estudiante
    private String curso;  // Propiedad para el curso del estudiante

    // Constructor por defecto que asigna valores genéricos
    public Estudiante() {
        this.nombre = "Desconocido"; // Asignar valor predeterminado para el nombre
        this.edad = 0;               // Asignar valor predeterminado para la edad
        this.curso = "Ninguno";      // Asignar valor predeterminado para el curso
    }

    // Constructor que acepta nombre y edad como parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; // Inicializar el nombre
        this.edad = edad;     // Inicializar la edad
        this.curso = "Ninguno"; // Inicializar el curso con valor predeterminado
    }

    // Constructor que acepta todos los parámetros y utiliza this() para llamar a otro constructor
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad); // Llama al constructor que inicializa nombre y edad
        this.curso = curso; // Inicializar el curso
    }

    // Método toString() para mostrar los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", curso=" + curso + "]";
    }
}
