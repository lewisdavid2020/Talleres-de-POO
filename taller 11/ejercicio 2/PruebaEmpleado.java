// Clase de prueba para las clases Empleado, Gerente y Vendedor
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Gerente
        Empleado gerente = new Gerente("Ana", 45, 5000, 1500);
        gerente.mostrarDetalles(); // Imprime los detalles del gerente

        // Crear un objeto Vendedor
        Empleado vendedor = new Vendedor("Carlos", 30, 3000, 800);
        vendedor.mostrarDetalles(); // Imprime los detalles del vendedor
    }
}
