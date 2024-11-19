// Definición de la clase abstracta Figura
public abstract class Figura {
    // Método abstracto para calcular el área
    public abstract double calcularArea();

    // Método para mostrar el área
    public void mostrarArea() {
        System.out.println("Área: " + calcularArea());
    }
}
