public class Bicicleta extends Transporte { // La clase Bicicleta extiende la clase abstracta Transporte

    @Override
    public void mover() { // Implementación del método mover para una bicicleta
        System.out.println("La bicicleta está pedaleando."); // Mensaje específico para bicicletas
    }
}
