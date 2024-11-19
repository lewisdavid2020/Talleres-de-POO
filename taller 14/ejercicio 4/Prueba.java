public class Prueba { // Clase de prueba para verificar el uso de las clases Vehiculo, Coche y Bicicleta
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Vehiculo miCoche = new Coche(); // Crea una referencia de Vehiculo apuntando a un objeto Coche
        Vehiculo miBicicleta = new Bicicleta(); // Crea una referencia de Vehiculo apuntando a un objeto Bicicleta

        miCoche.mover(); // Llama al método mover del coche
        miBicicleta.mover(); // Llama al método mover de la bicicleta
    }
}
