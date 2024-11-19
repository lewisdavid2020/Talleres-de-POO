// Definición de la clase Libro
public class Libro {
    // Propiedades de la clase
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Constructor por defecto que asigna valores predeterminados
    public Libro() {
        this.titulo = "Desconocido"; // Valor predeterminado para el título
        this.autor = "Desconocido";  // Valor predeterminado para el autor
        this.numeroPaginas = 0;      // Valor predeterminado para el número de páginas
    }

    // Constructor parametrizado que permite asignar valores específicos
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;            // Asigna el valor del parámetro titulo a la propiedad titulo
        this.autor = autor;              // Asigna el valor del parámetro autor a la propiedad autor
        this.numeroPaginas = numeroPaginas; // Asigna el valor del parámetro numeroPaginas a la propiedad numeroPaginas
    }

    // Método para mostrar los detalles del libro
    public void mostrarDetalles() {
        System.out.println("Titulo: " + this.titulo); // Muestra el título del libro
        System.out.println("Autor: " + this.autor);   // Muestra el autor del libro
        System.out.println("Número de páginas: " + this.numeroPaginas); // Muestra el número de páginas del libro
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de Libro usando el constructor por defecto
        Libro libro1 = new Libro();
        libro1.mostrarDetalles(); // Llama al método para mostrar los detalles del libro

        // Crear un objeto de Libro usando el constructor parametrizado
        Libro libro2 = new Libro("1984", "George Orwell", 328);
        libro2.mostrarDetalles(); // Llama al método para mostrar los detalles del libro
    }
}
