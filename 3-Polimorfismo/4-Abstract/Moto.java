class Moto  extends Veiculo {
    public Moto(String marca) {
        super(marca);
    }

    @Override
    public void acelerar() {
        Main.output.append(getMarca() + " Moto está acelerando.\n");
    }

    @Override
    public void frear() {
        Main.output.append(getMarca() + " Moto está freando.\n");
    }    
}