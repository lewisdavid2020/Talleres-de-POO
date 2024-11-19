// Definición de la clase Estudiante
public class Estudiante {
    // Propiedades de la clase
    private String nombre;
    private int edad;
    private String curso;

    // Constructor por defecto que asigna valores genéricos
    public Estudiante() {
        this.nombre = "Desconocido"; // Valor genérico para el nombre
        this.edad = 0;               // Valor genérico para la edad
        this.curso = "Ninguno";      // Valor genérico para el curso
    }

    // Constructor que acepta como parámetros el nombre y la edad
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;    // Asigna el valor del parámetro nombre a la propiedad nombre
        this.edad = edad;        // Asigna el valor del parámetro edad a la propiedad edad
        this.curso = "Ninguno";  // Asigna un valor predeterminado al curso
    }

    // Constructor que acepta todos los parámetros y utiliza this() para llamar a otro constructor
    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);     // Llama al constructor que acepta nombre y edad
        this.curso = curso;     // Asigna el valor del parámetro curso a la propiedad curso
    }

    // Método para mostrar los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + this.nombre);  // Muestra el nombre del estudiante
        System.out.println("Edad: " + this.edad);      // Muestra la edad del estudiante
        System.out.println("Curso: " + this.curso);    // Muestra el curso del estudiante
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de Estudiante usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles(); // Llama al método para mostrar los detalles del estudiante

        // Crear un objeto de Estudiante usando el constructor que acepta nombre y edad
        Estudiante estudiante2 = new Estudiante("Ana", 20);
        estudiante2.mostrarDetalles(); // Llama al método para mostrar los detalles del estudiante

        // Crear un objeto de Estudiante usando el constructor que acepta todos los parámetros
        Estudiante estudiante3 = new Estudiante("Juan", 22, "Matemáticas");
        estudiante3.mostrarDetalles(); // Llama al método para mostrar los detalles del estudiante
    }
}
