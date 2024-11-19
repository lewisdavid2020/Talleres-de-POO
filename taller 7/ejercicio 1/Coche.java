// Definición de la clase Coche
public class Coche {
    // Atributos de la clase Coche
    private String marca; // Atributo privado para la marca del coche
    private String modelo; // Atributo privado para el modelo del coche
    private static int contadorCoches = 0; // Atributo estático para contar el número de coches creados

    // Constructor de la clase Coche
    public Coche(String marca, String modelo) {
        this.marca = marca; // Inicializamos el atributo marca
        this.modelo = modelo; // Inicializamos el atributo modelo
        contadorCoches++; // Incrementamos el contador de coches cada vez que se crea un objeto de la clase
    }

    // Método estático para mostrar cuántos coches se han creado
    public static void mostrarContadorCoches() {
        System.out.println("Número de coches creados: " + contadorCoches); // Imprimimos el valor del contador de coches
    }

    // Método para mostrar los detalles del coche
    public void mostrarDetalles() {
        System.out.println("Marca: " + marca); // Imprimimos la marca del coche
        System.out.println("Modelo: " + modelo); // Imprimimos el modelo del coche
    }
}
