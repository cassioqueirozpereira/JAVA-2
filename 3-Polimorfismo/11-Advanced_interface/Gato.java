class Gato implements Animal {
    private String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String emitirSom() {
        return "Miando";
    } 
}