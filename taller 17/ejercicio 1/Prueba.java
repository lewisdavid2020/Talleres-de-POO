public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases Figura, Circulo y Rectangulo
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Figura circulo = new Circulo(5); // Crea una instancia de Circulo con radio 5
        Figura rectangulo = new Rectangulo(4, 6); // Crea una instancia de Rectangulo con largo 4 y ancho 6

        System.out.println("Área del círculo: " + circulo.calcularArea()); // Imprime el área del círculo
        System.out.println("Área del rectángulo: " + rectangulo.calcularArea()); // Imprime el área del rectángulo
    }
}
