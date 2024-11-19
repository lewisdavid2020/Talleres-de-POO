public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases Producto, GeneradorEtiqueta y PersistenciaProducto
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Producto producto = new Producto("Laptop", 1000.0, 0.15); // Crea una instancia de Producto
        GeneradorEtiqueta generador = new GeneradorEtiqueta(); // Crea una instancia de GeneradorEtiqueta
        PersistenciaProducto persistencia = new PersistenciaProducto(); // Crea una instancia de PersistenciaProducto

        generador.generarEtiqueta(producto); // Llama al método generarEtiqueta con la instancia de Producto
        persistencia.guardar(producto); // Llama al método guardar con la instancia de Producto
    }
}
