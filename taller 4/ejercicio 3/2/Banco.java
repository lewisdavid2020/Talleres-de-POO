public class Banco {
    // Propiedad privada
    private double saldo;

    // Constructor por defecto
    public Banco() {
        this.saldo = 0.0; // Asignar valor predeterminado para el saldo
    }

    // Constructor parametrizado
    public Banco(double saldo) {
        this.setSaldo(saldo); // Usar el método set para asignar y validar saldo
    }

    // Método get para saldo
    public double getSaldo() {
        return saldo; // Retornar el saldo
    }

    // Método set para saldo con validación
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo."); // Validación
        }
        this.saldo = saldo; // Asignar el valor a saldo
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo); // Mostrar el saldo actual
    }

    // Método para depositar dinero
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad; // Incrementar el saldo si la cantidad es positiva
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva.");
        }
    }

    // Método para retirar dinero
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            this.saldo -= cantidad; // Decrementar el saldo si la cantidad es válida
        } else {
            throw new IllegalArgumentException("Fondos insuficientes o cantidad inválida.");
        }
    }
}
