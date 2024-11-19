public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases Usuario, ServicioAutenticacion y ServicioValidacion
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Usuario usuario = new Usuario("usuario1", "contraseña123"); // Crea una instancia de Usuario
        ServicioAutenticacion servicioAutenticacion = new ServicioAutenticacion(); // Crea una instancia de ServicioAutenticacion
        ServicioValidacion servicioValidacion = new ServicioValidacion(); // Crea una instancia de ServicioValidacion

        boolean esAutenticado = servicioAutenticacion.autenticar(usuario, "usuario1", "contraseña123"); // Autentica el usuario
        boolean esContraseñaValida = servicioValidacion.validarContraseña(usuario); // Valida la contraseña

        System.out.println("Autenticado: " + esAutenticado); // Imprime si el usuario fue autenticado
        System.out.println("Contraseña válida: " + esContraseñaValida); // Imprime si la contraseña es válida
    }
}
