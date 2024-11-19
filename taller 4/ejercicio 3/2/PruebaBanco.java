public class PruebaBanco {
    public static void main(String[] args) {
        // Crear una instancia de Banco
        Banco banco = new Banco(1000.0);

        // Mostrar el saldo inicial
        banco.mostrarSaldo();

        // Depositar dinero
        banco.depositar(500.0);
        banco.mostrarSaldo();

        // Intentar retirar dinero
        banco.retirar(300.0);
        banco.mostrarSaldo();

        // Intentar retirar más dinero del disponible (debería lanzar una excepción)
        try {
            banco.retirar(1500.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Intentar establecer un saldo negativo (debería lanzar una excepción)
        try {
            banco.setSaldo(-100.0);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
