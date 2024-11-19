class Base {
    private int atributoPrivado = 10;

    public int getAtributoPrivado() {
        return atributoPrivado;
    }
}

class Derivada extends Base {
    public void mostrarAtributoPrivado() {
        // Acceder al atributo privado a través del método accesor
        System.out.println("Atributo Privado: " + getAtributoPrivado());
    }
}

