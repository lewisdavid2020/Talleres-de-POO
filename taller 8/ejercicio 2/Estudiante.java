// Definición de la clase Estudiante que hereda de Persona
public class Estudiante extends Persona {
    // Atributo adicional para la matrícula del estudiante
    private String matricula;

    // Constructor de la clase Estudiante
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad); // Llamada al constructor de la clase base Persona
        this.matricula = matricula; // Inicializamos el atributo matricula
    }

    // Método para obtener la matrícula del estudiante
    public String getMatricula() {
        return matricula;
    }

    // Método para mostrar la información del estudiante
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamamos al método mostrarInformacion de la clase base
        System.out.println("Matrícula: " + matricula); // Imprimimos la matrícula del estudiante
    }
}
