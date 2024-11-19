// Definición de la clase Producto
public class Producto {
    // Atributos de la clase Producto
    private String nombre; // Atributo privado para el nombre del producto
    private double precio; // Atributo privado para el precio del producto

    // Constructor de la clase Producto
    public Producto(String nombre, double precio) {
        this.nombre = nombre; // Usamos 'this' para diferenciar el parámetro nombre del atributo nombre
        this.precio = precio; // Usamos 'this' para diferenciar el parámetro precio del atributo precio
    }

    // Método para mostrar los detalles del producto
    public void mostrarProducto() {
        System.out.println("Nombre del Producto: " + nombre); // Imprime el nombre del producto
        System.out.println("Precio del Producto: $" + precio); // Imprime el precio del producto
    }
}
