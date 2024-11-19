// Clase de prueba para la clase Matematicas
public class PruebaMatematicas {
    public static void main(String[] args) {
        // Llamar a los métodos estáticos y mostrar los resultados
        double suma = Matematicas.sumar(5, 3);
        System.out.println("Suma de 5 y 3: " + suma); // Debería imprimir 8

        double resta = Matematicas.restar(10, 4);
        System.out.println("Resta de 10 y 4: " + resta); // Debería imprimir 6

        double multiplicacion = Matematicas.multiplicar(7, 2);
        System.out.println("Multiplicación de 7 y 2: " + multiplicacion); // Debería imprimir 14

        double division = Matematicas.dividir(20, 4);
        System.out.println("División de 20 y 4: " + division); // Debería imprimir 5

        double divisionPorCero = Matematicas.dividir(10, 0);
        System.out.println("División de 10 y 0: " + divisionPorCero); // Debería imprimir un mensaje de error y 0
    }
}
