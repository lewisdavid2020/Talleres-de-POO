public class Rectangulo extends Figura { // La clase Rectangulo extiende la clase abstracta Figura
    private double largo; // Variable privada para almacenar el largo del rectángulo
    private double ancho; // Variable privada para almacenar el ancho del rectángulo

    public Rectangulo(double largo, double ancho) { // Constructor para inicializar el rectángulo con su largo y ancho
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() { // Implementación del método calcularArea para un rectángulo
        return largo * ancho; // El área de un rectángulo es largo * ancho
    }
}
