class ClaseBase {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class ClaseDerivada extends ClaseBase {
    public void metodoDerivado() {
        System.out.println("Método de la clase derivada");
    }
}

public class PruebaPolimorfismo {
    public static void main(String[] args) {
        ClaseBase objeto = new ClaseDerivada();
        objeto.metodoBase(); // Esto es válido
        objeto.metodoDerivado(); // Error: metodoDerivado() no está definido en ClaseBase
    }
}
