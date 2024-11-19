public class ReporteExcel implements GeneradorReporte { // La clase ReporteExcel implementa la interfaz GeneradorReporte

    @Override
    public void generarReporte(String contenido) { // Implementación del método generarReporte
        System.out.println("Generando reporte en Excel con el contenido: " + contenido);
    }
}
