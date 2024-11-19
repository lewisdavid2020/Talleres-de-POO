public class Prueba { // Clase de prueba para verificar el funcionamiento de las clases CuentaBancaria y CuentaAhorros
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        CuentaBancaria cuentaAhorros = new CuentaAhorros(1000, 0.05); // Crea una instancia de CuentaAhorros con saldo inicial y tasa de interés

        cuentaAhorros.depositar(500); // Deposita dinero en la cuenta de ahorros
        cuentaAhorros.retirar(200); // Retira dinero de la cuenta de ahorros

        ((CuentaAhorros) cuentaAhorros).aplicarInteres(); // Aplica el interés al saldo de la cuenta de ahorros

        System.out.println("Saldo final: " + cuentaAhorros.getSaldo()); // Imprime el saldo final de la cuenta de ahorros
    }
}
