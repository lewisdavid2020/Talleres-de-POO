// Clase de prueba para las clases Vehiculo y Coche
public class PruebaVehiculo {
    public static void main(String[] args) {
        // Crear un objeto Vehiculo
        Vehiculo vehiculo1 = new Vehiculo("Ford", 180);
        vehiculo1.mostrarInformacion();

        // Crear un objeto Coche
        Coche coche1 = new Coche("Toyota", 200, 4);
        coche1.mostrarInformacion();
    }
}
