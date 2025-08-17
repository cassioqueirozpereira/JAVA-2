public class Aluno {
    // Atributos
    private String nome, matricula, naturalidade;

    // Construtor
    public Aluno(String nome, String naturalidade) {
        this.nome = nome;
        this.naturalidade = naturalidade;
    }

    // Getters
    @Override
    public String toString() {
        return String.format("Nome: %s, Naturalidade: %s", nome, naturalidade);
    }
}