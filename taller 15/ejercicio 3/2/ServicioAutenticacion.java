public class ServicioAutenticacion { // Declara una clase llamada ServicioAutenticacion

    public boolean autenticar(Usuario usuario, String nombreUsuario, String contraseña) { // Método para autenticar el usuario
        return usuario.getNombreUsuario().equals(nombreUsuario) && usuario.getContraseña().equals(contraseña);
    }
}
