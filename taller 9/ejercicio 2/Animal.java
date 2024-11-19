// Definición de la clase Animal
public class Animal {
    // Atributo de la clase Animal
    private String especie; // Atributo privado para la especie del animal

    // Constructor de la clase Animal
    public Animal(String especie) {
        this.especie = especie; // Inicializamos el atributo especie
    }

    // Método para mostrar la especie del animal
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie); // Imprimimos la especie del animal
    }
}
