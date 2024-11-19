import java.util.HashMap;
import java.util.Map;

public class AlmacenamientoNube implements Almacenamiento { // La clase AlmacenamientoNube implementa la interfaz Almacenamiento
    private Map<String, String> almacenamiento = new HashMap<>(); // Simulación de almacenamiento en la nube usando un HashMap

    @Override
    public void guardarArchivo(String nombreArchivo, String contenido) { // Implementación del método guardarArchivo
        almacenamiento.put(nombreArchivo, contenido); // Guarda el archivo en el HashMap
        System.out.println("Archivo guardado en la nube: " + nombreArchivo);
    }

    @Override
    public String recuperarArchivo(String nombreArchivo) { // Implementación del método recuperarArchivo
        return almacenamiento.get(nombreArchivo); // Recupera el archivo del HashMap
    }
}
