// Clase de prueba para las clases Figura, Circulo y Rectangulo
public class PruebaFigura {
    public static void main(String[] args) {
        // Crear un objeto Circulo
        Figura circulo = new Circulo(5);
        circulo.mostrarArea(); // Imprime el área del círculo

        // Crear un objeto Rectangulo
        Figura rectangulo = new Rectangulo(4, 6);
        rectangulo.mostrarArea(); // Imprime el área del rectángulo
    }
}
