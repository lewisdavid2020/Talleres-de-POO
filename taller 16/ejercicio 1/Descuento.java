public class Descuento { // Declara una clase llamada Descuento
    private double porcentaje; // Variable para almacenar el porcentaje de descuento

    public Descuento(double porcentaje) { // Constructor para inicializar el descuento con un porcentaje
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double precioOriginal) { // Método para aplicar el descuento al precio original
        return precioOriginal - (precioOriginal * porcentaje / 100); // Calcula el precio después del descuento
    }

    public double getPorcentaje() { // Método para obtener el porcentaje de descuento
        return porcentaje;
    }
}
