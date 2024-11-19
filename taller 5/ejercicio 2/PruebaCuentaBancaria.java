// Clase de prueba para instanciar objetos de CuentaBancaria y acceder a las propiedades
public class PruebaCuentaBancaria {
    public static void main(String[] args) {
        // Crear un objeto CuentaBancaria
        CuentaBancaria miCuenta = new CuentaBancaria("123456789", 1000, "Ahorros");

        // Intentar acceder directamente a la propiedad privada numeroCuenta - esto causará un error de compilación
        // System.out.println("Número de Cuenta (acceso directo): " + miCuenta.numeroCuenta);

        // Usar métodos encapsulados para interactuar con el saldo
        System.out.println("Saldo inicial: " + miCuenta.getSaldo());
        miCuenta.setSaldo(1500); // Establecer un nuevo saldo válido
        System.out.println("Nuevo Saldo: " + miCuenta.getSaldo());

        // Intentar establecer un saldo inválido
        miCuenta.setSaldo(-500);
        System.out.println("Saldo después de intento inválido: " + miCuenta.getSaldo());

        // Mostrar los detalles de la cuenta
        miCuenta.mostrarDetalles();
    }
}
