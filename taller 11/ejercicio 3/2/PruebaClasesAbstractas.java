abstract class ClaseAbstracta {
    // Método concreto en la clase abstracta
    public void metodoConcreto() {
        System.out.println("Método concreto de la clase abstracta");
    }

    public abstract void metodoAbstracto();
}

class ClaseDerivada extends ClaseAbstracta {
    // Sobrescribir el método concreto
    @Override
    public void metodoConcreto() {
        System.out.println("Método sobrescrito en la clase derivada");
    }

    @Override
    public void metodoAbstracto() {
        System.out.println("Implementación del método abstracto en la clase derivada");
    }
}

public class PruebaClasesAbstractas {
    public static void main(String[] args) {
        ClaseDerivada derivada = new ClaseDerivada();
        derivada.metodoConcreto();
        derivada.metodoAbstracto();
    }
}
