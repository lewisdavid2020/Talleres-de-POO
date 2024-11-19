public class ReportePDF implements GeneradorReporte { // La clase ReportePDF implementa la interfaz GeneradorReporte

    @Override
    public void generarReporte(String contenido) { // Implementación del método generarReporte
        System.out.println("Generando reporte en PDF con el contenido: " + contenido);
    }
}
