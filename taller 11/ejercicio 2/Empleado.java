// Definición de la clase abstracta Empleado
public abstract class Empleado {
    // Atributos de la clase Empleado
    private String nombre;
    private int edad;

    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método abstracto para calcular el salario
    public abstract double calcularSalario();

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + calcularSalario());
    }
}
