public class ServicioValidacion { // Declara una clase llamada ServicioValidacion

    public boolean validarContraseña(Usuario usuario) { // Método para validar la contraseña
        String contraseña = usuario.getContraseña();
        return contraseña.length() >= 8 && contraseña.matches(".*\\d.*") && contraseña.matches(".*[a-zA-Z].*");
    }
}
