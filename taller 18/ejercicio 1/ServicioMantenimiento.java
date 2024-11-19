public class ServicioMantenimiento implements Reparacion, Limpieza { // La clase ServicioMantenimiento implementa las interfaces Reparacion y Limpieza

    @Override
    public void reparar() { // Implementación del método reparar
        System.out.println("Realizando reparaciones."); // Imprime un mensaje de reparación
    }

    @Override
    public void limpiar() { // Implementación del método limpiar
        System.out.println("Realizando limpieza."); // Imprime un mensaje de limpieza
    }
}
