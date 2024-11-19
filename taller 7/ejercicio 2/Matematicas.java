// Definición de la clase Matematicas
public class Matematicas {

    // Método estático para realizar la suma de dos números
    public static double sumar(double a, double b) {
        return a + b;
    }

    // Método estático para realizar la resta de dos números
    public static double restar(double a, double b) {
        return a - b;
    }

    // Método estático para realizar la multiplicación de dos números
    public static double multiplicar(double a, double b) {
        return a * b;
    }

    // Método estático para realizar la división de dos números
    public static double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0; // Retornamos 0 o podríamos lanzar una excepción
        }
    }
}
