public class GestorAutenticacion { // Declara una clase llamada GestorAutenticacion
    private ServicioAutenticacion servicioAutenticacion; // Variable para almacenar la implementación de ServicioAutenticacion

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) { // Constructor para inicializar GestorAutenticacion
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public boolean autenticarUsuario(String usuario, String contraseña) { // Método para autenticar un usuario
        return servicioAutenticacion.autenticar(usuario, contraseña); // Delegar la autenticación al servicio
    }
}
