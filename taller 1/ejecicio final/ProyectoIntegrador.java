import java.util.Scanner; // Importar la clase Scanner para leer datos de la consola

public class ProyectoIntegrador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Crear un objeto Scanner para leer la entrada del usuario

        // Crear objeto de Libro
        System.out.println("Ingrese los datos del libro:");
        System.out.print("Titulo: ");
        String titulo = scanner.nextLine(); // Leer el título del libro desde la consola
        System.out.print("Autor: ");
        String autor = scanner.nextLine(); // Leer el autor del libro desde la consola
        System.out.print("Numero de Paginas: ");
        int numeroPaginas = scanner.nextInt(); // Leer el número de páginas del libro desde la consola
        scanner.nextLine(); // Limpiar el buffer
        Libro libro = new Libro(titulo, autor, numeroPaginas); // Crear un objeto Libro con los datos ingresados

        // Crear objeto de CuentaBancaria
        System.out.println("Ingrese los datos de la cuenta bancaria:");
        System.out.print("Numero de Cuenta: ");
        String numeroCuenta = scanner.nextLine(); // Leer el número de cuenta desde la consola
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble(); // Leer el saldo de la cuenta desde la consola
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tipo de Cuenta: ");
        String tipoCuenta = scanner.nextLine(); // Leer el tipo de cuenta desde la consola
        CuentaBancaria cuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta); // Crear un objeto CuentaBancaria con los datos ingresados

        // Crear objeto de Estudiante
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine(); // Leer el nombre del estudiante desde la consola
        System.out.print("Edad: ");
        int edad = scanner.nextInt(); // Leer la edad del estudiante desde la consola
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Curso: ");
        String curso = scanner.nextLine(); // Leer el curso del estudiante desde la consola
        Estudiante estudiante = new Estudiante(nombre, edad, curso); // Crear un objeto Estudiante con los datos ingresados

        // Mostrar los detalles de los objetos
        System.out.println("\nDetalles del Libro:");
        System.out.println(libro); // Utilizar el método toString() de la clase Libro para mostrar los detalles

        System.out.println("\nDetalles de la Cuenta Bancaria:");
        System.out.println(cuentaBancaria); // Utilizar el método toString() de la clase CuentaBancaria para mostrar los detalles

        System.out.println("\nDetalles del Estudiante:");
        System.out.println(estudiante); // Utilizar el método toString() de la clase Estudiante para mostrar los detalles
        
        scanner.close(); // Cerrar el objeto Scanner
    }
}
