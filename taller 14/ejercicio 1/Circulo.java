public class Circulo extends Figura { // La clase Circulo extiende la clase Figura
    private double radio; // Variable privada para almacenar el radio del círculo

    public Circulo(double radio) { // Constructor para inicializar el círculo con su radio
        this.radio = radio;
    }

    @Override
    public void calcularArea() { // Sobrescribe el método calcularArea para el círculo
        double area = Math.PI * radio * radio; // Calcula el área del círculo
        System.out.println("El área del círculo es: " + area); // Imprime el área del círculo
    }
}
    