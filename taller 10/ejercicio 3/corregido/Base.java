// Clase Base
public class Base {
    public void metodo() {
        System.out.println("Método de la clase Base");
    }
}

// Clase Derivada que sobrescribe el método con @Override
public class Derivada extends Base {
    @Override
    public void metodo() {
        System.out.println("Método de la clase Derivada");
    }

    public static void main(String[] args) {
        Derivada obj = new Derivada();
        obj.metodo(); // Llama al método sobrescrito en la clase Derivada
    }
}
