// Clase Empleado con las propiedades nombre y salario como protegidas
class Empleado {
    protected String nombre;  // Propiedad protegida para el nombre del empleado
    protected double salario; // Propiedad protegida para el salario del empleado

    // Constructor de la clase Empleado
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}

// Clase Gerente que hereda de Empleado y tiene una propiedad adicional departamento
class Gerente extends Empleado {
    private String departamento; // Propiedad adicional para el departamento del gerente

    // Constructor de la clase Gerente
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario); // Llamada al constructor de la clase base Empleado
        this.departamento = departamento; // Inicialización de la propiedad departamento
    }

    // Método para mostrar toda la información del empleado y del gerente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre); // Muestra el nombre del empleado (propiedad heredada)
        System.out.println("Salario: " + salario); // Muestra el salario del empleado (propiedad heredada)
        System.out.println("Departamento: " + departamento); // Muestra el departamento del gerente
    }
}
