public class Estudiante {
    // Propiedades privadas
    private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor por defecto
    public Estudiante() {
        this.nombre = "Desconocido"; // Asignar valor predeterminado para el nombre
        this.edad = 0;               // Asignar valor predeterminado para la edad
        this.notaPromedio = 0.0;     // Asignar valor predeterminado para la notaPromedio
    }

    // Constructor parametrizado
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.setNombre(nombre);        // Usar el método set para asignar y validar nombre
        this.setEdad(edad);            // Usar el método set para asignar y validar edad
        this.setNotaPromedio(notaPromedio); // Usar el método set para asignar y validar notaPromedio
    }

    // Métodos get y set con validaciones
    public String getNombre() {
        return nombre; // Retornar el valor de nombre
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío."); // Validación
        }
        this.nombre = nombre; // Asignar el valor a nombre
    }

    public int getEdad() {
        return edad; // Retornar el valor de edad
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa."); // Validación
        }
        this.edad = edad; // Asignar el valor a edad
    }

    public double getNotaPromedio() {
        return notaPromedio; // Retornar el valor de notaPromedio
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio < 0.0 || notaPromedio > 5.0) {
            throw new IllegalArgumentException("La nota promedio debe estar entre 0.0 y 5.0."); // Validación
        }
        this.notaPromedio = notaPromedio; // Asignar el valor a notaPromedio
    }

    // Método toString() para mostrar los detalles del estudiante
    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", notaPromedio=" + notaPromedio + "]";
    }
}
