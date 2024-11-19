public class GestorReportes { // Declara una clase llamada GestorReportes
    private GeneradorReporte generadorReporte; // Variable para almacenar la implementación de GeneradorReporte

    public GestorReportes(GeneradorReporte generadorReporte) { // Constructor para inicializar GestorReportes
        this.generadorReporte = generadorReporte;
    }

    public void generar(String contenido) { // Método para generar un reporte
        generadorReporte.generarReporte(contenido); // Delegar la generación del reporte al generador de reportes
    }
}
