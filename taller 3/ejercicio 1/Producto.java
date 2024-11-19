// Asumiendo que esta clase está en un paquete específico, por ejemplo, com.ejemplo.productos

class Producto {
    // 1. Propiedades con acceso de paquete (default)
    String nombre;
    double precio;
    int stock;

    // 2. Constructor con acceso de paquete que inicializa todas las propiedades
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 3. Método mostrarInfo() con acceso de paquete
    void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}

// 4. Clase de prueba en el mismo paquete
class ProductoPrueba {
    public static void main(String[] args) {
        // Crear un producto
        Producto miProducto = new Producto("Laptop", 1500.50, 10);
        
        // Acceder a los miembros (esto es posible porque está en el mismo paquete)
        System.out.println("Nombre del producto: " + miProducto.nombre);
        System.out.println("Precio del producto: " + miProducto.precio);
        System.out.println("Stock del producto: " + miProducto.stock);
        
        // Llamar al método mostrarInfo()
        miProducto.mostrarInfo();
    }
}