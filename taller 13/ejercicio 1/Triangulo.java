public class Triangulo extends Figura { // La clase Triangulo extiende la clase abstracta Figura
    private double base; // Variable privada para almacenar la base del triángulo
    private double altura; // Variable privada para almacenar la altura del triángulo

    public Triangulo(double base, double altura) { // Constructor para inicializar el triángulo con su base y altura
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() { // Implementación del método calcularArea para un triángulo
        return (base * altura) / 2; // El área de un triángulo es (base * altura) / 2
    }
}
