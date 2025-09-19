class Pato implements Animal {
    private String nome;

    public Pato(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String emitirSom() {
        return "Quack";
    }   
}