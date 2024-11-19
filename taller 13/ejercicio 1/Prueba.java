public class Prueba { // Clase de prueba para verificar la funcionalidad de las clases Rectangulo y Triangulo
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Figura rectangulo = new Rectangulo(5, 7); // Crea una instancia de Rectangulo con largo 5 y ancho 7
        Figura triangulo = new Triangulo(4, 6); // Crea una instancia de Triangulo con base 4 y altura 6

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea()); // Imprime el área del rectángulo
        System.out.println("Área del triángulo: " + triangulo.calcularArea()); // Imprime el área del triángulo
    }
}
