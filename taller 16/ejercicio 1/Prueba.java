public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases Descuento y DescuentoFijo
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Descuento descuentoPorcentaje = new Descuento(10); // Crea una instancia de Descuento con un 10% de descuento
        DescuentoFijo descuentoFijo = new DescuentoFijo(50); // Crea una instancia de DescuentoFijo con $50 de descuento

        double precioOriginal = 200; // Precio original del producto

        double precioConDescuentoPorcentaje = descuentoPorcentaje.aplicarDescuento(precioOriginal); // Aplica el descuento por porcentaje
        double precioConDescuentoFijo = descuentoFijo.aplicarDescuento(precioOriginal); // Aplica el descuento fijo

        System.out.println("Precio original: $" + precioOriginal); // Imprime el precio original
        System.out.println("Precio con descuento del 10%: $" + precioConDescuentoPorcentaje); // Imprime el precio después del descuento por porcentaje
        System.out.println("Precio con descuento fijo de $50: $" + precioConDescuentoFijo); // Imprime el precio después del descuento fijo
    }
}
