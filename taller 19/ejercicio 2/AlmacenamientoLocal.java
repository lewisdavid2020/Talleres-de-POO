import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoLocal implements Almacenamiento { // La clase AlmacenamientoLocal implementa la interfaz Almacenamiento
    private Map<String, String> almacenamiento = new HashMap<>(); // Simulación de almacenamiento local usando un HashMap

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) { // Implementación del método guardarArchivo
        almacenamiento.put(nombreArchivo, contenido); // Guarda el archivo en el HashMap
        System.out.println("Archivo guardado localmente: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) { // Implementación del método recuperarArchivo
        return almacenamiento.get(nombreArchivo); // Recupera el archivo del HashMap
    }
}
