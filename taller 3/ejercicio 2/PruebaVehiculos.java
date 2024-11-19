package pruebas; // Declarar el paquete pruebas

import vehiculos.Vehiculo; // Importar la clase Vehiculo desde el paquete vehiculos
import vehiculos.Moto;     // Importar la clase Moto desde el paquete vehiculos

public class PruebaVehiculos {
    public static void main(String[] args) {
        // Crear una instancia de Vehiculo
        Vehiculo vehiculo = new Vehiculo("Coche");

        // Crear una instancia de Moto
        Moto moto = new Moto("Moto", 150);

        // Intentar acceder a las propiedades directamente (esto causará errores de compilación)
        // System.out.println(vehiculo.tipo); // Error: tipo tiene acceso protegido en Vehiculo
        // System.out.println(moto.cilindrada); // Error: cilindrada tiene acceso privado en Moto

        // Usar los métodos públicos para acceder a las propiedades
        System.out.println("Tipo de Vehiculo: " + vehiculo.getTipo());
        System.out.println("Tipo de Moto: " + moto.getTipo());
        System.out.println("Cilindrada de Moto: " + moto.getCilindrada());

        // Mostrar detalles utilizando toString()
        System.out.println("\nDetalles del Vehiculo:");
        System.out.println(vehiculo);

        System.out.println("\nDetalles de la Moto:");
        System.out.println(moto);
    }
}
