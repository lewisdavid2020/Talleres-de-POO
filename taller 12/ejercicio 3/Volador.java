interface Hablador {
    void hablar();
}

interface Nadador {
    void nadar();
}

// Clase que implementa ambas interfaces pero no tiene lógica relevante para Nadador
public class Pajaro implements Hablador, Nadador {
    @Override
    public void hablar() {
        System.out.println("El pájaro está cantando");
    }

    @Override
    public void nadar() {
        // Implementación sin sentido
        System.out.println("El pájaro no puede nadar");
    }

    public static void main(String[] args) {
        Pajaro pajaro = new Pajaro();
        pajaro.hablar();
        pajaro.nadar();
    }
}
