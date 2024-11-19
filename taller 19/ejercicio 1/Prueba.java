public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases de autenticación
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal(); // Crea una instancia de AutenticacionLocal
        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth(); // Crea una instancia de AutenticacionOAuth

        GestorAutenticacion gestorLocal = new GestorAutenticacion(autenticacionLocal); // Crea un gestor con AutenticacionLocal
        GestorAutenticacion gestorOAuth = new GestorAutenticacion(autenticacionOAuth); // Crea un gestor con AutenticacionOAuth

        System.out.println("Autenticación Local: " + gestorLocal.autenticarUsuario("usuarioLocal", "contraseñaLocal")); // Prueba de autenticación local
        System.out.println("Autenticación OAuth: " + gestorOAuth.autenticarUsuario("usuarioOAuth", "contraseñaOAuth")); // Prueba de autenticación OAuth
    }
}
