public class Prueba { // Clase de prueba para verificar el funcionamiento de la exportación de documentos
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Documento documento = new Documento("Este es el contenido del documento."); // Crea una instancia de Documento

        Exportador exportadorPDF = new ExportadorPDF(); // Crea una instancia de ExportadorPDF
        Exportador exportadorWord = new ExportadorWord(); // Crea una instancia de ExportadorWord
        Exportador exportadorExcel = new ExportadorExcel(); // Crea una instancia de ExportadorExcel

        exportadorPDF.exportar(documento); // Exporta el documento a PDF
        exportadorWord.exportar(documento); // Exporta el documento a Word
        exportadorExcel.exportar(documento); // Exporta el documento a Excel
    }
}
