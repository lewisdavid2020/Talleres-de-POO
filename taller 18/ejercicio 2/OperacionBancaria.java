public interface OperacionBancaria { // Declara una interfaz llamada OperacionBancaria
    void transferir(double monto, String cuentaDestino); // Método para transferencias
    void retirar(double monto); // Método para retiros
    void pagarFactura(double monto, String factura); // Método para pagos de facturas
}
