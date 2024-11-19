public class ExportadorPDF implements Exportador { // Clase ExportadorPDF que implementa Exportador
    @Override
    public void exportar(Documento documento) { // Implementación del método exportar para PDF
        System.out.println("Exportando el documento a PDF con el contenido: " + documento.getContenido());
    }
}
