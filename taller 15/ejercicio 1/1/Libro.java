public class Libro { // Declara una clase llamada Libro
    private String titulo; // Variable para almacenar el título del libro
    private String autor; // Variable para almacenar el autor del libro
    private String isbn; // Variable para almacenar el ISBN del libro

    public Libro(String titulo, String autor, String isbn) { // Constructor para inicializar el libro
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() { // Método para obtener el título del libro
        return titulo;
    }

    public String getAutor() { // Método para obtener el autor del libro
        return autor;
    }

    public String getIsbn() { // Método para obtener el ISBN del libro
        return isbn;
    }

    public void generarReporte() { // Método para generar un reporte del libro
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn);
    }

    public void guardar() { // Método para guardar la información del libro (simulación de persistencia)
        System.out.println("Guardando el libro en la base de datos...");
    }
}