// Definición de la clase CuentaBancaria
public class CuentaBancaria {
    // Propiedad privada para el número de cuenta
    private String numeroCuenta;
    
    // Propiedad privada para el saldo de la cuenta
    private double saldo;
    
    // Propiedad pública para el tipo de cuenta
    public String tipoCuenta;

    // Constructor de la clase CuentaBancaria
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta; // Inicializamos la propiedad numeroCuenta
        this.saldo = saldo; // Inicializamos la propiedad saldo
        this.tipoCuenta = tipoCuenta; // Inicializamos la propiedad tipoCuenta
    }

    // Método getter para obtener el saldo
    public double getSaldo() {
        return saldo;
    }

    // Método setter para establecer el saldo con validación
    public void setSaldo(double saldo) {
        if (saldo >= 0) { // Validamos que el saldo no sea negativo
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
        }
    }

    // Método público para mostrar los detalles de la cuenta
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + numeroCuenta); // Mostramos el número de cuenta
        System.out.println("Saldo: " + saldo); // Mostramos el saldo de la cuenta
        System.out.println("Tipo de Cuenta: " + tipoCuenta); // Mostramos el tipo de cuenta
    }
}
