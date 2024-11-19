// Definición de la clase Rectangulo que extiende Figura
public class Rectangulo extends Figura {
    private double largo; // Atributo privado para el largo del rectángulo
    private double ancho; // Atributo privado para el ancho del rectángulo

    // Constructor de la clase Rectangulo
    public Rectangulo(double largo, double ancho) {
        this.largo = largo; // Inicializamos el atributo largo
        this.ancho = ancho; // Inicializamos el atributo ancho
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return largo * ancho; // Fórmula para calcular el área de un rectángulo
    }
}
