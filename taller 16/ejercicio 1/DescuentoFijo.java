public class DescuentoFijo extends Descuento { // La clase DescuentoFijo extiende la clase Descuento
    private double cantidadFija; // Variable para almacenar la cantidad fija de descuento

    public DescuentoFijo(double cantidadFija) { // Constructor para inicializar el descuento fijo
        super(0); // Llama al constructor de la clase base con un porcentaje de 0
        this.cantidadFija = cantidadFija;
    }

    @Override
    public double aplicarDescuento(double precioOriginal) { // Sobrescribe el método aplicarDescuento
        return precioOriginal - cantidadFija; // Calcula el precio después del descuento fijo
    }

    public double getCantidadFija() { // Método para obtener la cantidad fija de descuento
        return cantidadFija;
    }
}

