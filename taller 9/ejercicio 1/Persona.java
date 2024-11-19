// Definición de la clase Persona
public class Persona {
    // Atributos de la clase Persona
    private String nombre; // Atributo privado para el nombre de la persona
    private int edad; // Atributo privado para la edad de la persona

    // Constructor de la clase Persona
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Inicializamos el atributo nombre
        this.edad = edad; // Inicializamos el atributo edad
    }

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre); // Imprimimos el nombre de la persona
        System.out.println("Edad: " + edad); // Imprimimos la edad de la persona
    }
}
