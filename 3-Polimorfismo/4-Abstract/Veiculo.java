abstract class Veiculo {
    private String marca;

    public Veiculo(String marca) {
        this.marca = marca;
    }

    public abstract void acelerar();

    public abstract void frear();

    public String getMarca() {
        return this.marca;
    }
}