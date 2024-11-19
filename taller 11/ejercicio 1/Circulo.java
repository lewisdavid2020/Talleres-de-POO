// Definición de la clase Circulo que extiende Figura
public class Circulo extends Figura {
    private double radio; // Atributo privado para el radio del círculo

    // Constructor de la clase Circulo
    public Circulo(double radio) {
        this.radio = radio; // Inicializamos el atributo radio
    }

    // Implementación del método calcularArea
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula para calcular el área de un círculo
    }
}
