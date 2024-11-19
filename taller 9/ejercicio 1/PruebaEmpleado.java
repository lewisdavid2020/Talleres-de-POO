// Clase de prueba para las clases Persona y Empleado
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona1 = new Persona("Carlos", 40);
        persona1.mostrarDetalles(); // Imprime los detalles de la persona

        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("Ana", 30, "Recursos Humanos");
        empleado1.mostrarDetalles(); // Imprime los detalles del empleado
    }
}
