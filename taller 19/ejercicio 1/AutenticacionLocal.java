public class AutenticacionLocal implements ServicioAutenticacion { // La clase AutenticacionLocal implementa la interfaz ServicioAutenticacion

    @Override
    public boolean autenticar(String usuario, String contraseña) { // Implementación del método autenticar
        // Simulación de autenticación local
        if ("usuarioLocal".equals(usuario) && "contraseñaLocal".equals(contraseña)) {
            return true; // Autenticación exitosa
        }
        return false; // Autenticación fallida
    }
}
