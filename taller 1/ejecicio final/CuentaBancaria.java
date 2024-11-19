public class CuentaBancaria {
    private String numeroCuenta; // Propiedad para el número de cuenta
    private double saldo;        // Propiedad para el saldo
    private String tipoCuenta;   // Propiedad para el tipo de cuenta

    // Constructor por defecto que asigna valores genéricos
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000"; // Asignar valor predeterminado para el número de cuenta
        this.saldo = 0.0;                 // Asignar valor predeterminado para el saldo
        this.tipoCuenta = "Desconocido";  // Asignar valor predeterminado para el tipo de cuenta
    }

    // Constructor parametrizado con dos parámetros: numeroCuenta y tipoCuenta
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta; // Inicializar el número de cuenta
        this.saldo = 0.0;                 // Inicializar el saldo con valor predeterminado
        this.tipoCuenta = tipoCuenta;     // Inicializar el tipo de cuenta
    }

    // Constructor sobrecargado con tres parámetros: numeroCuenta, saldo y tipoCuenta
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta; // Inicializar el número de cuenta
        this.saldo = saldo;               // Inicializar el saldo
        this.tipoCuenta = tipoCuenta;     // Inicializar el tipo de cuenta
    }

    // Método toString() para mostrar los detalles de la cuenta bancaria
    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", tipoCuenta=" + tipoCuenta + "]";
    }
}
