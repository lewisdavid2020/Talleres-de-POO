public class PersistenciaProducto { // Declara una clase llamada PersistenciaProducto

    public void guardar(Producto producto) { // Método para guardar la información del producto (simulación de persistencia)
        System.out.println("Guardando el producto " + producto.getNombre() + " en la base de datos...");
    }
}
