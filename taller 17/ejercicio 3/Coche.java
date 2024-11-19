public class Coche extends Transporte { // La clase Coche extiende la clase abstracta Transporte

    @Override
    public void mover() { // Implementación del método mover para un coche
        System.out.println("El coche está conduciendo."); // Mensaje específico para coches
    }
}
