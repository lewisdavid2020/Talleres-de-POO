package paquete; // Declarar el paquete

public class PruebaPersona {
    public static void main(String[] args) {
        // Crear una instancia de Persona usando el constructor parametrizado
        Persona persona = new Persona("Juan", 25);

        // Acceder al atributo privado nombre a través de los métodos get y set
        System.out.println("Nombre: " + persona.getNombre());
        persona.setNombre("Carlos");
        System.out.println("Nombre modificado: " + persona.getNombre());

        // Acceder al atributo de paquete edad directamente
        System.out.println("Edad: " + persona.edad);
        persona.edad = 30;
        System.out.println("Edad modificada: " + persona.edad);
    }
}
