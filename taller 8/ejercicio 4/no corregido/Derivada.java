class Base {
    private int atributoPrivado = 10;

    public int getAtributoPrivado() {
        return atributoPrivado;
    }
}

class Derivada extends Base {
    public void mostrarAtributoPrivado() {
        // Intentar acceder al atributo privado (esto causará un error de compilación)
        System.out.println("Atributo Privado: " + atributoPrivado); // Error: atributoPrivado tiene acceso privado en Base
    }
}
