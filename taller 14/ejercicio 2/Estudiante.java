public class Estudiante extends Persona { // La clase Estudiante extiende la clase Persona
    @Override
    public void presentarse() { // Sobrescribe el método presentarse para el estudiante
        System.out.println("Hola, soy un estudiante."); // Mensaje específico para estudiantes
    }
}
