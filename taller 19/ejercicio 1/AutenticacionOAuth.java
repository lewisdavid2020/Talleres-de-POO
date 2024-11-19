public class AutenticacionOAuth implements ServicioAutenticacion { // La clase AutenticacionOAuth implementa la interfaz ServicioAutenticacion

    @Override
    public boolean autenticar(String usuario, String contraseña) { // Implementación del método autenticar
        // Simulación de autenticación OAuth
        if ("usuarioOAuth".equals(usuario) && "contraseñaOAuth".equals(contraseña)) {
            return true; // Autenticación exitosa
        }
        return false; // Autenticación fallida
    }
}
