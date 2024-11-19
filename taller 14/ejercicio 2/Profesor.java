public class Profesor extends Persona { // La clase Profesor extiende la clase Persona
    @Override
    public void presentarse() { // Sobrescribe el método presentarse para el profesor
        System.out.println("Hola, soy un profesor."); // Mensaje específico para profesores
    }
}
