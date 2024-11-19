// Clase de prueba para las clases Persona, Estudiante y Profesor
public class PruebaPolimorfismo {
    public static void main(String[] args) {
        // Crear un objeto de Persona
        Persona persona = new Persona();
        persona.presentarse(); // Imprime el mensaje general

        // Crear un objeto de Estudiante
        Persona estudiante = new Estudiante();
        estudiante.presentarse(); // Imprime el mensaje específico de estudiante

        // Crear un objeto de Profesor
        Persona profesor = new Profesor();
        profesor.presentarse(); // Imprime el mensaje específico de profesor
    }
}
