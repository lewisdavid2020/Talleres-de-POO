public abstract class CuentaBancaria { // Declara una clase abstracta llamada CuentaBancaria
    protected double saldo; // Variable protegida para almacenar el saldo de la cuenta

    public CuentaBancaria(double saldoInicial) { // Constructor para inicializar la cuenta con un saldo inicial
        this.saldo = saldoInicial;
    }

    public double getSaldo() { // Método para obtener el saldo de la cuenta
        return saldo;
    }

    public abstract void depositar(double cantidad); // Método abstracto para depositar dinero en la cuenta
    public abstract void retirar(double cantidad); // Método abstracto para retirar dinero de la cuenta
}
