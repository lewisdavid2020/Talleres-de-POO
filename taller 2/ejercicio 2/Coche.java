public class Coche {
    // Propiedades privadas
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    // Constructor por defecto
    public Coche() {
        this.marca = "Desconocida"; // Valor predeterminado para la marca
        this.modelo = "Desconocido"; // Valor predeterminado para el modelo
        this.velocidadMaxima = 0;    // Valor predeterminado para la velocidad máxima
    }

    // Constructor parametrizado
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;                  // Inicializa la marca
        this.modelo = modelo;                // Inicializa el modelo
        this.velocidadMaxima = velocidadMaxima; // Inicializa la velocidad máxima
    }

    // Método para obtener la marca
    public String getMarca() {
        return marca; // Retorna el valor de la marca
    }

    // Método para establecer la marca
    public void setMarca(String marca) {
        this.marca = marca; // Asigna el valor a la marca
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo; // Retorna el valor del modelo
    }

    // Método para establecer el modelo
    public void setModelo(String modelo) {
        this.modelo = modelo; // Asigna el valor al modelo
    }

    // Método para obtener la velocidad máxima
    public int getVelocidadMaxima() {
        return velocidadMaxima; // Retorna el valor de la velocidad máxima
    }

    // Método para establecer la velocidad máxima
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima; // Asigna el valor a la velocidad máxima
    }

    // Método para acelerar el coche
    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento; // Incrementa la velocidad máxima si el incremento es positivo
        } else {
            System.out.println("El incremento debe ser positivo."); // Mensaje de error si el incremento es negativo
        }
    }

    // Método toString() para mostrar los detalles del coche
    @Override
    public String toString() {
        return "Coche [marca=" + marca + ", modelo=" + modelo + ", velocidadMaxima=" + velocidadMaxima + "]";
    }
}
