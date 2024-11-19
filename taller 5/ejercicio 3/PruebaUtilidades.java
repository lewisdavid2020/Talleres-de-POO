// Clase de prueba para validar el funcionamiento de los métodos de la clase Utilidades
public class PruebaUtilidades {
    public static void main(String[] args) {
        Utilidades utilidades = new Utilidades(); // Crear una instancia de la clase Utilidades

        // Validar la suma de 5 y 3
        double suma = utilidades.sumar(5, 3);
        System.out.println("Suma de 5 y 3: " + suma); // Debería imprimir 8

        // Validar la resta de 10 y 4
        double resta = utilidades.restar(10, 4);
        System.out.println("Resta de 10 y 4: " + resta); // Debería imprimir 6

        // Validar la multiplicación de 7 y 2
        double multiplicacion = utilidades.multiplicar(7, 2);
        System.out.println("Multiplicación de 7 y 2: " + multiplicacion); // Debería imprimir 14

        // Validar la división de 20 y 4
        double division = utilidades.dividir(20, 4);
        System.out.println("División de 20 y 4: " + division); // Debería imprimir 5

        // Validar la división por cero
        double divisionPorCero = utilidades.dividir(10, 0);
        System.out.println("División de 10 y 0: " + divisionPorCero); // Debería imprimir un mensaje de error y 0
    }
}

