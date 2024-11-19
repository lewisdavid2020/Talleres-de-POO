public class Prueba { // Clase de prueba para verificar el funcionamiento de las interfaces Transferencia, Retiro y PagoFactura
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        Cuenta cuenta = new Cuenta(1000); // Crea una instancia de Cuenta con un saldo inicial

        cuenta.transferir(200, "CuentaDestino123"); // Realiza una transferencia
        cuenta.retirar(100); // Realiza un retiro
        cuenta.pagarFactura(150, "Factura123"); // Realiza un pago de factura

        System.out.println("Saldo final: $" + cuenta.getSaldo()); // Imprime el saldo final de la cuenta
    }
}
