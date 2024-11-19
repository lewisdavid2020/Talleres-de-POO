public class Prueba { // Clase de prueba para verificar el uso del polimorfismo
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Persona persona = new Persona(); // Crea una instancia de Persona
        Persona estudiante = new Estudiante(); // Crea una instancia de Estudiante como Persona
        Persona profesor = new Profesor(); // Crea una instancia de Profesor como Persona

        persona.presentarse(); // Llama al método presentarse de Persona
        estudiante.presentarse(); // Llama al método presentarse de Estudiante
        profesor.presentarse(); // Llama al método presentarse de Profesor
    }
}
