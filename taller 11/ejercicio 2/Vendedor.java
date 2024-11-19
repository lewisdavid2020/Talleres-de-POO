// Definición de la clase Vendedor que extiende Empleado
public class Vendedor extends Empleado {
    private double salarioBase;
    private double comision;

    // Constructor de la clase Vendedor
    public Vendedor(String nombre, int edad, double salarioBase, double comision) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.comision = comision;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase + comision;
    }
}
