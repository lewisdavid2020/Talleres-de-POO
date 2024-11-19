// Clase de prueba para instanciar objetos de Empleado y acceder a las propiedades
public class PruebaEmpleado {
    public static void main(String[] args) {
        // Crear un objeto Empleado
        Empleado empleado1 = new Empleado("Juan Perez", 3000);

        // Acceder y mostrar el nombre público del empleado
        System.out.println("Nombre: " + empleado1.nombre);

        // Acceder y mostrar el salario usando el método getter
        System.out.println("Salario: " + empleado1.getSalario());

        // Intentar establecer un nuevo salario válido
        empleado1.setSalario(4000);
        System.out.println("Nuevo Salario: " + empleado1.getSalario());

        // Intentar establecer un salario inválido
        empleado1.setSalario(-500);
        System.out.println("Salario después de intento inválido: " + empleado1.getSalario());
    }
}
