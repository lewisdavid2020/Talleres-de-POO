// Definición de la clase Vehículo
class Vehiculo {
    protected String tipo; // Propiedad protegida para el tipo de vehículo
    protected String marca; // Propiedad protegida para la marca del vehículo

    // Constructor de la clase Vehículo
    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
}

// Definición de la subclase Moto que hereda de Vehículo
class Moto extends Vehiculo {
    private int cilindrada; // Propiedad adicional para la cilindrada de la moto

    // Constructor de la clase Moto
    public Moto(String tipo, String marca, int cilindrada) {
        super(tipo, marca); // Llamada al constructor de la clase base Vehículo
        this.cilindrada = cilindrada; // Inicialización de la propiedad cilindrada
    }

    // Método para mostrar la información de la moto
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo); // Acceso a la propiedad protegida tipo
        System.out.println("Marca: " + marca); // Acceso a la propiedad protegida marca
        System.out.println("Cilindrada: " + cilindrada); // Acceso a la propiedad privada cilindrada
    }
}

// Clase no relacionada intentando acceder a miembros protegidos
public class PruebaAcceso {
    public static void main(String[] args) {
        Moto miMoto = new Moto("Deportiva", "Yamaha", 600);
        miMoto.mostrarInformacion();

        // Intentando acceder directamente a miembros protegidos desde una clase no relacionada
        // Esto causará errores de compilación
        System.out.println("Tipo (acceso directo): " + miMoto.tipo);
        System.out.println("Marca (acceso directo): " + miMoto.marca);
    }
}
