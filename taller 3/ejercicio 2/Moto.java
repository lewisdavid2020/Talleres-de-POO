package vehiculos; // Declarar el paquete vehiculos

public class Moto extends Vehiculo {
    // Propiedad adicional específica de Moto
    private int cilindrada;

    // Constructor por defecto
    public Moto() {
        super("Moto"); // Llamar al constructor de Vehiculo con tipo "Moto"
        this.cilindrada = 0; // Asignar valor predeterminado para la cilindrada
    }

    // Constructor parametrizado
    public Moto(String tipo, int cilindrada) {
        super(tipo); // Llamar al constructor de Vehiculo con el tipo especificado
        this.cilindrada = cilindrada; // Inicializar la cilindrada
    }

    // Método para obtener la cilindrada
    public int getCilindrada() {
        return cilindrada; // Retornar la cilindrada
    }

    // Método para establecer la cilindrada
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada; // Asignar el valor a la cilindrada
    }

    // Método toString() para mostrar los detalles de la moto
    @Override
    public String toString() {
        return "Moto [tipo=" + getTipo() + ", cilindrada=" + cilindrada + "]";
    }
}
