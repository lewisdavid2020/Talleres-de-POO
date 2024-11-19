// Definición de la clase Gerente que extiende Empleado
public class Gerente extends Empleado {
    private double salarioBase;
    private double bono;

    // Constructor de la clase Gerente
    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.bono = bono;
    }

    // Implementación del método calcularSalario
    @Override
    public double calcularSalario() {
        return salarioBase + bono;
    }
}
