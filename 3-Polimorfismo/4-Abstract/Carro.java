class Carro extends Veiculo {
    public Carro(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        Main.output.append(getMarca() + " Carro está acelerando.\n");
    }

    @Override
    public void frear() {
        Main.output.append(getMarca() + " Carro está freando.\n");
    }
}