public class Producto { // Declara una clase llamada Producto
    private String nombre; // Variable para almacenar el nombre del producto
    private double precioBase; // Variable para almacenar el precio base del producto
    private double impuesto; // Variable para almacenar el impuesto del producto

    public Producto(String nombre, double precioBase, double impuesto) { // Constructor para inicializar el producto
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public String getNombre() { // Método para obtener el nombre del producto
        return nombre;
    }

    public double getPrecioBase() { // Método para obtener el precio base del producto
        return precioBase;
    }

    public double getImpuesto() { // Método para obtener el impuesto del producto
        return impuesto;
    }

    public double calcularPrecioFinal() { // Método para calcular el precio final del producto
        return precioBase + (precioBase * impuesto);
    }
}
