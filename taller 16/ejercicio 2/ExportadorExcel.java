public class ExportadorExcel implements Exportador { // Clase ExportadorExcel que implementa Exportador
    @Override
    public void exportar(Documento documento) { // Implementación del método exportar para Excel
        System.out.println("Exportando el documento a Excel con el contenido: " + documento.getContenido());
    }
}
