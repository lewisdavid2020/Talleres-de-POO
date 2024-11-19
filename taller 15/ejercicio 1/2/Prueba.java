public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases Libro, GeneradorReporte y PersistenciaLibro
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", "123456789"); // Crea una instancia de Libro
        GeneradorReporte generador = new GeneradorReporte(); // Crea una instancia de GeneradorReporte
        PersistenciaLibro persistencia = new PersistenciaLibro(); // Crea una instancia de PersistenciaLibro

        generador.generarReporte(libro); // Llama al método generarReporte con la instancia de Libro
        persistencia.guardar(libro); // Llama al método guardar con la instancia de Libro
    }
}
