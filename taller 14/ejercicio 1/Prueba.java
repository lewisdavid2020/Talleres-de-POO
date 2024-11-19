public class Prueba { // Clase de prueba para verificar el uso del polimorfismo
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Figura figura1 = new Circulo(5); // Crea una instancia de Circulo con radio 5
        Figura figura2 = new Rectangulo(4, 6); // Crea una instancia de Rectangulo con largo 4 y ancho 6

        figura1.calcularArea(); // Llama al método calcularArea del círculo
        figura2.calcularArea(); // Llama al método calcularArea del rectángulo
    }
}
