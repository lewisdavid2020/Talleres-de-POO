// Clase de prueba para la clase Coche
public class PruebaCoche {
    public static void main(String[] args) {
        // Crear objetos Coche
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("BMW", "Sail");
        
        // Mostrar detalles de cada coche
        coche1.mostrarDetalles();
        coche2.mostrarDetalles();
        coche3.mostrarDetalles();

        // Mostrar el número de coches creados
        Coche.mostrarContadorCoches();
    }
}
