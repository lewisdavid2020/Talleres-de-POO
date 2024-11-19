// Clase de prueba para la clase Estudiante
public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear un objeto Estudiante usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles(); // Imprime los detalles del estudiante

        // Crear un objeto Estudiante usando el constructor con parámetros
        Estudiante estudiante2 = new Estudiante("Ana Gomez", 21);
        estudiante2.mostrarDetalles(); // Imprime los detalles del estudiante
    }
}

