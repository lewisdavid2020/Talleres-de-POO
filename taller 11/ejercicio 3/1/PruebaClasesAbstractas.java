abstract class ClaseAbstracta {
    public void metodoConcreto() {
        System.out.println("Método concreto de la clase abstracta");
    }

    public abstract void metodoAbstracto();
}

public class PruebaClasesAbstractas {
    public static void main(String[] args) {
        // Intentar instanciar la clase abstracta (esto causará un error de compilación)
        ClaseAbstracta objeto = new ClaseAbstracta(); // Error: ClaseAbstracta is abstract; cannot be instantiated
    }
}
