public interface Almacenamiento { // Declara una interfaz llamada Almacenamiento
    void guardarArchivo(String nombreArchivo, String contenido); // Método para guardar archivos
    String recuperarArchivo(String nombreArchivo); // Método para recuperar archivos
}
