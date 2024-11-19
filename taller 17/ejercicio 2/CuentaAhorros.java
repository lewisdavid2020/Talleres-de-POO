public class CuentaAhorros extends CuentaBancaria { // La clase CuentaAhorros extiende la clase abstracta CuentaBancaria
    private double tasaInteres; // Variable privada para almacenar la tasa de interés

    public CuentaAhorros(double saldoInicial, double tasaInteres) { // Constructor para inicializar la cuenta de ahorros con saldo inicial y tasa de interés
        super(saldoInicial); // Llama al constructor de la clase base
        this.tasaInteres = tasaInteres;
    }

    public void aplicarInteres() { // Método para aplicar el interés al saldo
        saldo += saldo * tasaInteres;
    }

    @Override
    public void depositar(double cantidad) { // Implementación del método depositar
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    @Override
    public void retirar(double cantidad) { // Implementación del método retirar
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            System.out.println("Fondos insuficientes o cantidad inválida.");
        }
    }
}
