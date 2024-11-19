// Definición de la clase Coche que hereda de Vehiculo
public class Coche extends Vehiculo {
    // Atributo adicional para el número de puertas del coche
    private int numeroDePuertas;

    // Constructor de la clase Coche
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima); // Llamada al constructor de la clase base Vehiculo
        this.numeroDePuertas = numeroDePuertas; // Inicializamos el atributo numeroDePuertas
    }

    // Método para mostrar la información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamamos al método mostrarInformacion de la clase base
        System.out.println("Número de Puertas: " + numeroDePuertas); // Imprimimos el número de puertas del coche
    }
}
