public class Prueba { // Clase de prueba para verificar el funcionamiento de las interfaces Reparacion y Limpieza
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        ServicioMantenimiento mantenimiento = new ServicioMantenimiento(); // Crea una instancia de ServicioMantenimiento

        mantenimiento.reparar(); // Llama al método reparar
        mantenimiento.limpiar(); // Llama al método limpiar
    }
}
