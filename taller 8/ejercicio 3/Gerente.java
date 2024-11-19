// Definición de la clase Gerente que hereda de Empleado
public class Gerente extends Empleado {
    // Atributo adicional para el departamento del gerente
    private String departamento;

    // Constructor de la clase Gerente
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llamada al constructor de la clase base Empleado
        this.departamento = departamento; // Inicializamos el atributo departamento
    }

    // Método para mostrar los detalles del gerente
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llamamos al método mostrarDetalles de la clase base
        System.out.println("Departamento: " + departamento); // Imprimimos el departamento del gerente
    }
}
