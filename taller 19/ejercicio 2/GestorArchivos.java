public class GestorArchivos { // Declara una clase llamada GestorArchivos
    private Almacenamiento almacenamiento; // Variable para almacenar la implementación de Almacenamiento

    public GestorArchivos(Almacenamiento almacenamiento) { // Constructor para inicializar GestorArchivos
        this.almacenamiento = almacenamiento;
    }

    public void guardar(String nombreArchivo, String contenido) { // Método para guardar un archivo
        almacenamiento.guardarArchivo(nombreArchivo, contenido); // Delegar el guardado al servicio de almacenamiento
    }

    public String recuperar(String nombreArchivo) { // Método para recuperar un archivo
        return almacenamiento.recuperarArchivo(nombreArchivo); // Delegar la recuperación al servicio de almacenamiento
    }
}
