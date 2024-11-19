public class Camion implements Conduccion, CargaMercancias { // La clase Camion implementa las interfaces Conduccion y CargaMercancias

    @Override
    public void conducir() { // Implementación del método conducir
        System.out.println("El camión está conduciendo."); // Mensaje específico para conducir
    }

    @Override
    public void cargarMercancias() { // Implementación del método cargarMercancias
        System.out.println("El camión está cargando mercancías."); // Mensaje específico para cargar mercancías
    }
}
