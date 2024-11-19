public class PruebaEstudiante {
    public static void main(String[] args) {
        // Crear un objeto de Estudiante usando el constructor por defecto
        Estudiante estudiante1 = new Estudiante();
        System.out.println(estudiante1); // Mostrar detalles del estudiante

        // Crear un objeto de Estudiante usando el constructor parametrizado
        Estudiante estudiante2 = new Estudiante("Ana", 20, 4.5);
        System.out.println(estudiante2); // Mostrar detalles del estudiante

        // Modificar las propiedades del estudiante2 usando los métodos set
        estudiante2.setNombre("Carlos");
        estudiante2.setEdad(22);
        estudiante2.setNotaPromedio(4.8);

        // Mostrar los detalles modificados del estudiante2
        System.out.println(estudiante2);
    }
}
