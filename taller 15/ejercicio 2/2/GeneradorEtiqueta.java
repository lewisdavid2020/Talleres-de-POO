public class GeneradorEtiqueta { // Declara una clase llamada GeneradorEtiqueta

    public void generarEtiqueta(Producto producto) { // Método para generar una etiqueta del producto
        System.out.println("Producto: " + producto.getNombre() + ", Precio: " + producto.calcularPrecioFinal());
    }
}
