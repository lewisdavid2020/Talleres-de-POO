public class GeneradorReporte { // Declara una clase llamada GeneradorReporte

    public void generarReporte(Libro libro) { // Método para generar un reporte del libro
        System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", ISBN: " + libro.getIsbn());
    }
}
