abstract class Pessoa {
    protected int identificador;

    public Pessoa(int identificador) {
        this.identificador = identificador;
    }

    // Método abstrato
    public abstract void atualizarID();

    // Método concreto
    public int recuperarID() {
        return identificador;
    }
}