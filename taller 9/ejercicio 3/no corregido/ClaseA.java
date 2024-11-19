public class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

// Intentar utilizar `super` en una clase que no es derivada
public class ClaseB {
    public void metodoB() {
        super.metodoA(); // Error: Cannot use 'super' keyword in this context
    }

    public static void main(String[] args) {
        ClaseB claseB = new ClaseB();
        claseB.metodoB();
    }
}
