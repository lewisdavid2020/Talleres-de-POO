public class Circulo extends Figura { // La clase Circulo extiende la clase abstracta Figura
    private double radio; // Variable privada para almacenar el radio del círculo

    public Circulo(double radio) { // Constructor para inicializar el círculo con su radio
        this.radio = radio;
    }

    @Override
    public double calcularArea() { // Implementación del método calcularArea para un círculo
        return Math.PI * radio * radio; // Calcula el área del círculo usando la fórmula πr²
    }
}
