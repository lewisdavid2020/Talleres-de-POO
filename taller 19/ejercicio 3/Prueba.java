public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases de reportes
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        GeneradorReporte reportePDF = new ReportePDF(); // Crea una instancia de ReportePDF
        GeneradorReporte reporteExcel = new ReporteExcel(); // Crea una instancia de ReporteExcel

        GestorReportes gestorPDF = new GestorReportes(reportePDF); // Crea un gestor con ReportePDF
        GestorReportes gestorExcel = new GestorReportes(reporteExcel); // Crea un gestor con ReporteExcel

        gestorPDF.generar("Contenido del reporte PDF"); // Genera un reporte en PDF
        gestorExcel.generar("Contenido del reporte Excel"); // Genera un reporte en Excel
    }
}
