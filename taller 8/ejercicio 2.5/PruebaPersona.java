// Clase de prueba para las clases Persona y Estudiante
public class PruebaPersona {
    public static void main(String[] args) {
        // Crear un objeto Estudiante
        Estudiante estudiante1 = new Estudiante("Ana", 20, "A12345");
        estudiante1.mostrarInformacion(); // Imprime los detalles del estudiante

        // Crear otro objeto Estudiante
        Estudiante estudiante2 = new Estudiante("Juan", 22, "B67890");
        estudiante2.mostrarInformacion(); // Imprime los detalles del estudiante
    }
}
