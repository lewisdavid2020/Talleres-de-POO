class Base {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class Derivada extends Base {
    // Sobrescribir el método sin usar @Override (mala práctica)
    public void metodoBase() {
        System.out.println("Método sobrescrito en la clase derivada");
    }
}

public class PruebaSobrescritura {
    public static void main(String[] args) {
        Derivada derivada = new Derivada();
        derivada.metodoBase();
    }
}