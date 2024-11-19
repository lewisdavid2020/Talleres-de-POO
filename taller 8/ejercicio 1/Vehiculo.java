// Definición de la clase Vehiculo
public class Vehiculo {
    // Atributos de la clase Vehiculo
    protected String marca; // Atributo protegido para la marca del vehículo
    protected int velocidadMaxima; // Atributo protegido para la velocidad máxima del vehículo

    // Constructor de la clase Vehiculo
    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca; // Inicializamos el atributo marca
        this.velocidadMaxima = velocidadMaxima; // Inicializamos el atributo velocidadMaxima
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca); // Imprimimos la marca del vehículo
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h"); // Imprimimos la velocidad máxima del vehículo
    }
}
