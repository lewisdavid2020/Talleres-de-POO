public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases Transporte, Bicicleta y Coche
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Transporte bicicleta = new Bicicleta(); // Crea una instancia de Bicicleta
        Transporte coche = new Coche(); // Crea una instancia de Coche

        bicicleta.mover(); // Llama al método mover de la bicicleta
        coche.mover(); // Llama al método mover del coche
    }
}
