interface Hablador {
    void hablar(); // Método abstracto
}

public class Persona implements Hablador {
    // No se proporciona la implementación del método hablar (esto causará un error de compilación)
    // public void hablar() {
    //     System.out.println("Hablando");
    // }

    // Constructor
    public Persona() {
        System.out.println("Se ha creado una instancia de Persona");
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
    }
}
