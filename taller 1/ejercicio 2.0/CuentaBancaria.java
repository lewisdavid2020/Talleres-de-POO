// Definición de la clase CuentaBancaria
public class CuentaBancaria {
    // Propiedades de la clase
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // Constructor por defecto que inicializa las propiedades con valores predeterminados
    public CuentaBancaria() {
        this.numeroCuenta = "0000000000"; // Valor predeterminado para el número de cuenta
        this.saldo = 0.0;                 // Valor predeterminado para el saldo
        this.tipoCuenta = "Desconocido";  // Valor predeterminado para el tipo de cuenta
    }

    // Constructor parametrizado con dos parámetros (numeroCuenta y tipoCuenta)
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  // Asigna el valor del parámetro numeroCuenta a la propiedad numeroCuenta
        this.saldo = 0.0;                  // Inicializa el saldo con un valor predeterminado
        this.tipoCuenta = tipoCuenta;      // Asigna el valor del parámetro tipoCuenta a la propiedad tipoCuenta
    }

    // Constructor sobrecargado con tres parámetros (numeroCuenta, saldo y tipoCuenta)
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;  // Asigna el valor del parámetro numeroCuenta a la propiedad numeroCuenta
        this.saldo = saldo;                // Asigna el valor del parámetro saldo a la propiedad saldo
        this.tipoCuenta = tipoCuenta;      // Asigna el valor del parámetro tipoCuenta a la propiedad tipoCuenta
    }

    // Método para mostrar los detalles de la cuenta bancaria
    public void mostrarDetalles() {
        System.out.println("Número de Cuenta: " + this.numeroCuenta); // Muestra el número de cuenta
        System.out.println("Saldo: " + this.saldo);                   // Muestra el saldo
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);     // Muestra el tipo de cuenta
    }

    // Método principal para probar la clase
    public static void main(String[] args) {
        // Crear un objeto de CuentaBancaria usando el constructor por defecto
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles(); // Llama al método para mostrar los detalles de la cuenta

        // Crear un objeto de CuentaBancaria usando el constructor parametrizado con dos parámetros
        CuentaBancaria cuenta2 = new CuentaBancaria("1234567890", "Ahorros");
        cuenta2.mostrarDetalles(); // Llama al método para mostrar los detalles de la cuenta

        // Crear un objeto de CuentaBancaria usando el constructor sobrecargado con tres parámetros
        CuentaBancaria cuenta3 = new CuentaBancaria("0987654321", 1500.0, "Corriente");
        cuenta3.mostrarDetalles(); // Llama al método para mostrar los detalles de la cuenta
    }
}
