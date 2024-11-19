public class Prueba { // Clase de prueba para verificar el funcionamiento de las interfaces Conduccion y CargaMercancias
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Camion camion = new Camion(); // Crea una instancia de Camion

        camion.conducir(); // Llama al método conducir
        camion.cargarMercancias(); // Llama al método cargarMercancias
    }
}
