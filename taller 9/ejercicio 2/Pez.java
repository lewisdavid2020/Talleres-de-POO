// Definición de la clase Pez que hereda de Animal
public class Pez extends Animal {
    // Atributo adicional para el tipo de agua del pez
    private String tipoDeAgua;

    // Constructor de la clase Pez
    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Llamada al constructor de la clase base Animal
        this.tipoDeAgua = tipoDeAgua; // Inicializamos el atributo tipoDeAgua
    }

    // Método para mostrar los detalles del pez
    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Llamamos al método mostrarEspecie de la clase base
        System.out.println("Tipo de Agua: " + tipoDeAgua); // Imprimimos el tipo de agua del pez
    }
}
