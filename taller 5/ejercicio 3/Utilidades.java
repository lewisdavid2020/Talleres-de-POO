// Definición de la clase Utilidades
public class Utilidades {
    // Método público para realizar la suma de dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método público para realizar la resta de dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método público para realizar la multiplicación de dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método público para realizar la división de dos números
    public double dividir(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: División por cero.");
            return 0; // Retornamos 0 o podríamos lanzar una excepción
        }
    }
}
