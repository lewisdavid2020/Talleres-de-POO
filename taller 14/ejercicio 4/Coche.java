public class Coche extends Vehiculo { // La clase Coche extiende la clase Vehiculo
    @Override
    public void mover() { // Sobrescribe el método mover para el coche
        System.out.println("El coche está conduciendo."); // Mensaje específico para coches
    }
}
