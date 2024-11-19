public class ExportadorWord implements Exportador { // Clase ExportadorWord que implementa Exportador
    @Override
    public void exportar(Documento documento) { // Implementación del método exportar para Word
        System.out.println("Exportando el documento a Word con el contenido: " + documento.getContenido());
    }
}
