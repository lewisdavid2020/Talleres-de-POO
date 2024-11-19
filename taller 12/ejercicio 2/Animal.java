public class Animal implements Volador, Nadador { // La clase Animal implementa las interfaces Volador y Nadador
    @Override
    public void volar() { // Implementación del método volar de la interfaz Volador
        System.out.println("Estoy volando."); // Imprime "Estoy volando." en la consola
    }

    @Override
    public void nadar() { // Implementación del método nadar de la interfaz Nadador
        System.out.println("Estoy nadando."); // Imprime "Estoy nadando." en la consola
    }
}
