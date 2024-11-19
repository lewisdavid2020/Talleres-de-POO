public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases de almacenamiento
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal(); // Crea una instancia de AlmacenamientoLocal
        Almacenamiento almacenamientoNube = new AlmacenamientoNube(); // Crea una instancia de AlmacenamientoNube

        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal); // Crea un gestor con AlmacenamientoLocal
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube); // Crea un gestor con AlmacenamientoNube

        gestorLocal.guardar("archivo1.txt", "Contenido del archivo 1"); // Guarda un archivo localmente
        gestorNube.guardar("archivo2.txt", "Contenido del archivo 2"); // Guarda un archivo en la nube

        System.out.println("Recuperado localmente: " + gestorLocal.recuperar("archivo1.txt")); // Recupera un archivo localmente
        System.out.println("Recuperado en la nube: " + gestorNube.recuperar("archivo2.txt")); // Recupera un archivo en la nube
    }
}
