 // Definición de la clase Empleado que hereda de Persona
public class Empleado extends Persona {
    // Atributo adicional para el departamento del empleado
    private String departamento;

    // Constructor de la clase Empleado
    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad); // Llamada al constructor de la clase base Persona
        this.departamento = departamento; // Inicializamos el atributo departamento
    }

    // Método para obtener el departamento del empleado
    public String getDepartamento() {
        return departamento;
    }

    // Método para mostrar los detalles del empleado
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamamos al método mostrarDetalles de la clase base
        System.out.println("Departamento: " + departamento); // Imprimimos el departamento del empleado
    }
}
 
