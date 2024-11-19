// Definición de la clase Empleado
public class Empleado {
    // Propiedad pública para el nombre del empleado
    public String nombre;
    
    // Propiedad privada para el salario del empleado
    private double salario;

    // Constructor de la clase Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario); // Usamos el método set para validar el salario al instanciar el objeto
    }

    // Método getter para obtener el salario
    public double getSalario() {
        return salario;
    }

    // Método setter para establecer el salario con validación
    public void setSalario(double salario) {
        if (salario > 0) { // Validamos que el salario sea positivo
            this.salario = salario;
        } else {
            System.out.println("El salario debe ser positivo.");
        }
    }
}
