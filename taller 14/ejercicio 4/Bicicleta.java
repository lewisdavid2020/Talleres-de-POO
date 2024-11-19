public class Bicicleta extends Vehiculo { // La clase Bicicleta extiende la clase Vehiculo
    @Override
    public void mover() { // Sobrescribe el método mover para la bicicleta
        System.out.println("La bicicleta está pedaleando."); // Mensaje específico para bicicletas
    }
}
