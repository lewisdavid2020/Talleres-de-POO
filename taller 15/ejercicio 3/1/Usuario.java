public class Usuario { // Declara una clase llamada Usuario
    private String nombreUsuario; // Variable para almacenar el nombre de usuario
    private String contraseña; // Variable para almacenar la contraseña

    public Usuario(String nombreUsuario, String contraseña) { // Constructor para inicializar el usuario
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() { // Método para obtener el nombre de usuario
        return nombreUsuario;
    }

    public String getContraseña() { // Método para obtener la contraseña
        return contraseña;
    }

    public boolean autenticar(String nombreUsuario, String contraseña) { // Método para autenticar el usuario
        return this.nombreUsuario.equals(nombreUsuario) && this.contraseña.equals(contraseña);
    }

    public boolean validarContraseña() { // Método para validar la contraseña
        return contraseña.length() >= 8 && contraseña.matches(".*\\d.*") && contraseña.matches(".*[a-zA-Z].*");
    }
}
