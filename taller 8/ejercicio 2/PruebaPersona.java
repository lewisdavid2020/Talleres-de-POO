// Clase de prueba para las clases Persona y Estudiante
public class PruebaPersona {
    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona1 = new Persona("Carlos", 40);
        persona1.mostrarInformacion();

        // Crear un objeto Estudiante
        Estudiante estudiante1 = new Estudiante("Ana", 20, "A12345");
        estudiante1.mostrarInformacion();
    }
}
