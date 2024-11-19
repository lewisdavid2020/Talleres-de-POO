public class Banco {
    // Propiedad protegida
    protected double saldo;

    // Constructor por defecto
    public Banco() {
        this.saldo = 0.0; // Asignar valor predeterminado para el saldo
    }

    // Constructor parametrizado
    public Banco(double saldo) {
        this.saldo = saldo; // Inicializar el saldo
    }

    // Método para mostrar el saldo
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
}
