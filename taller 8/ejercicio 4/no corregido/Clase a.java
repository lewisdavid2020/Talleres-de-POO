class ClaseA {
    public void metodoA() {
        System.out.println("Método de ClaseA");
    }
}

class ClaseB {
    public void metodoB() {
        System.out.println("Método de ClaseB");
    }
}

// Intentar heredar de ClaseA y ClaseB (esto causará un error de compilación)
class ClaseC extends ClaseA, ClaseB {
    public void metodoC() {
        System.out.println("Método de ClaseC");
    }
}
