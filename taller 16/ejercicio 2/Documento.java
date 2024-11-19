public class Documento { // Declara una clase llamada Documento
    private String contenido; // Variable para almacenar el contenido del documento

    public Documento(String contenido) { // Constructor para inicializar el documento con su contenido
        this.contenido = contenido;
    }

    public void exportarPDF() { // Método para exportar el documento a PDF
        System.out.println("Exportando el documento a PDF con el contenido: " + contenido);
    }

    public String getContenido() { // Método para obtener el contenido del documento
        return contenido;
    }
}
