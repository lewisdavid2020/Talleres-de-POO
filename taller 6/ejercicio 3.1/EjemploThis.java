public class EjemploThis {
    // Propiedad de la clase
    private String mensaje;

    // Constructor
    public EjemploThis(String mensaje) {
        this.mensaje = mensaje; // Inicializar la propiedad mensaje con el valor del parámetro mensaje
    }

    // Método static que recibe una instancia de EjemploThis
    public static void metodoStatic(EjemploThis instancia) {
        // Usar la instancia pasada como parámetro para acceder a la propiedad mensaje
        System.out.println(instancia.mensaje); // Esto es correcto
    }

    // Método no estático que utiliza 'this' correctamente
    public void metodoNoStatic() {
        System.out.println(this.mensaje); // Esto es correcto
    }

    public static void main(String[] args) {
        EjemploThis ejemplo = new EjemploThis("¡Hola, mundo!");
        ejemplo.metodoNoStatic(); // Llamada correcta a un método no estático

        // Llamada correcta al método estático, pasando la instancia como parámetro
        EjemploThis.metodoStatic(ejemplo);
    }
}
