public class EjemploStaticCorregido {
    // Atributo no estático
    private int contador;

    // Constructor para inicializar el contador
    public EjemploStaticCorregido(int contador) {
        this.contador = contador; // Inicializar el atributo contador
    }

    // Método estático que recibe una instancia y modifica su atributo no estático
    public static void incrementarContador(EjemploStaticCorregido instancia) {
        // Usar la instancia pasada como parámetro para modificar el atributo contador
        instancia.contador++; // Esto es correcto
    }

    // Método para obtener el valor del contador
    public int getContador() {
        return contador; // Retornar el valor del contador
    }

    public static void main(String[] args) {
        EjemploStaticCorregido ejemplo = new EjemploStaticCorregido(5);

        // Llamada al método no estático correctamente
        System.out.println("Contador inicial: " + ejemplo.getContador());

        // Llamada al método estático, pasando la instancia como parámetro
        EjemploStaticCorregido.incrementarContador(ejemplo);

        // Mostrar el contador incrementado
        System.out.println("Contador después de incrementar: " + ejemplo.getContador());
    }
}
