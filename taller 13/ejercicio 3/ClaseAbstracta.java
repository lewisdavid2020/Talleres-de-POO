abstract class ClaseAbstracta {
    public void metodoConcreto() {
        System.out.println("Método concreto de la clase abstracta");
    }

    // Intentar definir un método predeterminado (esto causará un error de compilación)
    public default void metodoPredeterminado() {
        System.out.println("Método predeterminado de la clase abstracta");
    }
}

public class PruebaClasesAbstractas {
    public static void main(String[] args) {
        ClaseAbstracta objeto = new ClaseAbstracta() {
            @Override
            public void metodoConcreto() {
                System.out.println("Método concreto sobrescrito");
            }
        };
        objeto.metodoConcreto();
        objeto.metodoPredeterminado(); // Error: illegal start of type
    }
}
