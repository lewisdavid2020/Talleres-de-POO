public class Cuenta implements Transferencia, Retiro, PagoFactura { // La clase Cuenta implementa las interfaces Transferencia, Retiro y PagoFactura
    private double saldo; // Variable para almacenar el saldo de la cuenta

    public Cuenta(double saldoInicial) { // Constructor para inicializar la cuenta con un saldo inicial
        this.saldo = saldoInicial;
    }

    @Override
    public void transferir(double monto, String cuentaDestino) { // Implementación del método transferir
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Transferencia de $" + monto + " a la cuenta " + cuentaDestino + " realizada.");
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    @Override
    public void retirar(double monto) { // Implementación del método retirar
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado.");
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    @Override
    public void pagarFactura(double monto, String factura) { // Implementación del método pagarFactura
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Pago de factura de $" + monto + " para " + factura + " realizado.");
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }

    public double getSaldo() { // Método para obtener el saldo de la cuenta
        return saldo;
    }
}
