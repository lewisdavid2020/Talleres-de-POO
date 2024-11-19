public class Libro {
    private String titulo; // Propiedad para el título del libro
    private String autor;  // Propiedad para el autor del libro
    private int numeroPaginas; // Propiedad para el número de páginas del libro

    // Constructor por defecto que asigna valores genéricos
    public Libro() {
        this.titulo = "Desconocido"; // Asignar valor predeterminado para el título
        this.autor = "Desconocido";  // Asignar valor predeterminado para el autor
        this.numeroPaginas = 0;      // Asignar valor predeterminado para el número de páginas
    }

    // Constructor parametrizado para inicializar las propiedades con valores específicos
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;            // Inicializar el título
        this.autor = autor;              // Inicializar el autor
        this.numeroPaginas = numeroPaginas; // Inicializar el número de páginas
    }

    // Método toString() para mostrar los detalles del libro
    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + "]";
    }
}
