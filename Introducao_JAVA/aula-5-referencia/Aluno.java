public class Aluno {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Aluno(String nome, int idade) {
        this.setNome(nome);
        this.setIdade(idade);
    }

    // Métodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
}