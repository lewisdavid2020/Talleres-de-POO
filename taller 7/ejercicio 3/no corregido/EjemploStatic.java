public class EjemploStatic {
    // Atributo no estático
    private int contador;

    // Constructor para inicializar el contador
    public EjemploStatic(int contador) {
        this.contador = contador; // Inicializar el atributo contador
    }

    // Método static que intenta acceder y modificar el atributo no estático
    public static void incrementarContador() {
        // Error: no se puede utilizar 'this' en un contexto estático
        this.contador++; // Error: cannot use 'this' in a static context
    }

    // Método para obtener el valor del contador
    public int getContador() {
        return contador; // Retornar el valor del contador
    }

    public static void main(String[] args) {
        EjemploStatic ejemplo = new EjemploStatic(5);

        // Llamada al método no estático correctamente
        System.out.println("Contador inicial: " + ejemplo.getContador());

        // Llamada al método estático que causará un error de compilación
        // EjemploStatic.incrementarContador(); // Descomentar esta línea causará un error de compilación
    }
}
