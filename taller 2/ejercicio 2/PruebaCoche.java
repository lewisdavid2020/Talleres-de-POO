public class PruebaCoche {
    public static void main(String[] args) {
        // Crear un objeto de Coche usando el constructor por defecto
        Coche coche1 = new Coche();
        System.out.println(coche1); // Mostrar detalles del coche

        // Crear un objeto de Coche usando el constructor parametrizado
        Coche coche2 = new Coche("Toyota", "Corolla", 180);
        System.out.println(coche2); // Mostrar detalles del coche

        // Intentar acceder directamente a las propiedades privadas (esto causará errores de compilación)
        // coche2.marca = "Honda"; // Error: marca tiene acceso privado en Coche
        // coche2.modelo = "Civic"; // Error: modelo tiene acceso privado en Coche
        // coche2.velocidadMaxima = 200; // Error: velocidadMaxima tiene acceso privado en Coche

        // Usar los métodos get y set para acceder a las propiedades
        coche2.setMarca("Honda");
        coche2.setModelo("Civic");
        coche2.setVelocidadMaxima(200);

        // Mostrar los detalles modificados del coche2
        System.out.println(coche2);

        // Probar el método acelerar
        coche2.acelerar(20); // Incrementa la velocidad máxima en 20
        System.out.println("Después de acelerar: " + coche2);

        coche2.acelerar(-10); // Intento de incremento negativo (no debería cambiar la velocidad)
    }
}
