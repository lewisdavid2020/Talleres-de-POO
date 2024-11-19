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
}
