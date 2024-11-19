public class PruebaAcceso {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");

        // Intentar acceder directamente a la propiedad privada
        // Esto causará un error de compilación
        // System.out.println(persona.nombre); // Error: nombre tiene acceso privado en Persona
    }
}
