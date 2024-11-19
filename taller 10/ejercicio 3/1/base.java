class Base {
    public void metodoBase() {
        System.out.println("Método de la clase base");
    }
}

class Derivada extends Base {
    // Intentar sobrescribir el método cambiando su firma (esto no es sobrescritura)
    public void metodoBase(int parametro) {
        System.out.println("Método de la clase derivada con parámetro: " + parametro);
    }
}

public class PruebaSobrescritura {
    public static void main(String[] args) {
        Derivada derivada = new Derivada();
        derivada.metodoBase(); // Error: The method metodoBase() is undefined for the type Derivada
        derivada.metodoBase(10); // Llamada al nuevo método con parámetro
    }
}
