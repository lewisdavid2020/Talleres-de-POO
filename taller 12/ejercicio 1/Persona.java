public class Persona implements Hablador, Trabajador {
    private String nombre;

    // Constructor para inicializar el nombre
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Implementación del método hablar de la interfaz Hablador
    @Override
    public void hablar() {
        System.out.println(nombre + " está hablando.");
    }

    // Implementación del método trabajar de la interfaz Trabajador
    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}
