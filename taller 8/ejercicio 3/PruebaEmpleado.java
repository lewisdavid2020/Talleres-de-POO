// Clase de prueba para las clases Empleado y Gerente
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("Juan Perez", 3000);
        empleado1.mostrarDetalles(); // Imprime los detalles del empleado

        // Crear un objeto Gerente
        Gerente gerente1 = new Gerente("Ana Gomez", 5000, "Ventas");
        gerente1.mostrarDetalles(); // Imprime los detalles del gerente
    }
}
