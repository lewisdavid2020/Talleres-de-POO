// Clase de prueba para las clases Vehiculo y Bicicleta
public class PruebaVehiculo {
    public static void main(String[] args) {
        // Crear un objeto de Vehiculo
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.moverse(); // Imprime el mensaje general

        // Crear un objeto de Bicicleta
        Vehiculo bicicleta = new Bicicleta();
        bicicleta.moverse(); // Imprime el mensaje específico de bicicleta
    }
}
