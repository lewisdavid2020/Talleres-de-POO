public class Rectangulo extends Figura { // La clase Rectangulo extiende la clase Figura
    private double largo; // Variable privada para almacenar el largo del rectángulo
    private double ancho; // Variable privada para almacenar el ancho del rectángulo

    public Rectangulo(double largo, double ancho) { // Constructor para inicializar el rectángulo con su largo y ancho
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public void calcularArea() { // Sobrescribe el método calcularArea para el rectángulo
        double area = largo * ancho; // Calcula el área del rectángulo
        System.out.println("El área del rectángulo es: " + area); // Imprime el área del rectángulo
    }
}
