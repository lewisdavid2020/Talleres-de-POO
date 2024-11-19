package vehiculos; // Declarar el paquete vehiculos

public class Vehiculo {
    // Propiedad protegida para que las clases derivadas puedan acceder
    protected String tipo;

    // Constructor por defecto
    public Vehiculo() {
        this.tipo = "Desconocido"; // Asignar valor predeterminado para el tipo
    }

    // Constructor parametrizado
    public Vehiculo(String tipo) {
        this.tipo = tipo; // Inicializar el tipo
    }

    // Método para obtener el tipo de vehículo
    public String getTipo() {
        return tipo; // Retornar el tipo de vehículo
    }

    // Método para establecer el tipo de vehículo
    public void setTipo(String tipo) {
        this.tipo = tipo; // Asignar el valor al tipo de vehículo
    }

    // Método toString() para mostrar los detalles del vehículo
    @Override
    public String toString() {
        return "Vehiculo [tipo=" + tipo + "]";
    }
}
