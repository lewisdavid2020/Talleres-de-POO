package paquete; // Declarar el paquete

public class Persona {
    // Atributo privado
    private String nombre;
    // Atributo de paquete (sin modificador de acceso explícito)
    int edad;

    // Constructor por defecto
    public Persona() {
        this.nombre = "Desconocido"; // Valor predeterminado para el nombre
        this.edad = 0;               // Valor predeterminado para la edad
    }

    // Constructor parametrizado
    public Persona(String nombre, int edad) {
        this.nombre = nombre; // Inicializar el nombre
        this.edad = edad;     // Inicializar la edad
    }

    // Método get para nombre
    public String getNombre() {
        return nombre; // Retornar el nombre
    }

    // Método set para nombre
    public void setNombre(String nombre) {
        this.nombre = nombre; // Asignar el valor a nombre
    }
}
