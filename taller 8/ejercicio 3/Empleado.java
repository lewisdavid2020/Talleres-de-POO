// Definición de la clase Empleado
public class Empleado {
    // Atributos de la clase Empleado
    private String nombre; // Atributo privado para el nombre del empleado
    private double salario; // Atributo privado para el salario del empleado

    // Constructor de la clase Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre; // Inicializamos el atributo nombre
        this.salario = salario; // Inicializamos el atributo salario
    }

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre); // Imprimimos el nombre del empleado
        System.out.println("Salario: $" + salario); // Imprimimos el salario del empleado
    }
}
