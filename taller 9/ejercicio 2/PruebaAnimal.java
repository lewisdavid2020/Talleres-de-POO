// Clase de prueba para las clases Animal y Pez
public class PruebaAnimal {
    public static void main(String[] args) {
        // Crear un objeto Animal
        Animal animal1 = new Animal("Mamífero");
        animal1.mostrarEspecie(); // Imprime los detalles del animal

        // Crear un objeto Pez
        Pez pez1 = new Pez("Pez Dorado", "Agua Dulce");
        pez1.mostrarEspecie(); // Imprime los detalles del pez
    }
}
