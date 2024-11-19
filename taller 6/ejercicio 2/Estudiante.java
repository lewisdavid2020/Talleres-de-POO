// Definición de la clase Estudiante
public class Estudiante {
    // Atributos de la clase Estudiante
    private String nombre; // Atributo privado para el nombre del estudiante
    private int edad; // Atributo privado para la edad del estudiante

    // Constructor por defecto
    public Estudiante() {
        this("Desconocido", 0); // Llamada al constructor con dos parámetros utilizando this()
    }

    // Constructor con dos parámetros
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre; // Usamos 'this' para diferenciar el parámetro nombre del atributo nombre
        this.edad = edad; // Usamos 'this' para diferenciar el parámetro edad del atributo edad
    }

    // Método para imprimir los detalles del estudiante
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre); // Imprime el nombre del estudiante
        System.out.println("Edad: " + edad); // Imprime la edad del estudiante
    }
}
