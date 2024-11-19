public class EjemploThis {
    // Propiedad de la clase
    private String mensaje;

    // Constructor
    public EjemploThis(String mensaje) {
        this.mensaje = mensaje; // Inicializar la propiedad mensaje con el valor del parámetro mensaje
    }

    // Método static que intenta usar 'this' (esto causará un error de compilación)
    public static void metodoStatic() {
        // Error: no se puede utilizar 'this' en un contexto estático
        System.out.println(this.mensaje); // Error: cannot use 'this' in a static context
    }

    // Método no estático que utiliza 'this' correctamente
    public void metodoNoStatic() {
        System.out.println(this.mensaje); // Esto es correcto
    }

    public static void main(String[] args) {
        EjemploThis ejemplo = new EjemploThis("¡Hola, mundo!");
        ejemplo.metodoNoStatic(); // Llamada correcta a un método no estático

        // EjemploThis.metodoStatic(); // Llamada que causará un error de compilación si se descomenta
    }
}
