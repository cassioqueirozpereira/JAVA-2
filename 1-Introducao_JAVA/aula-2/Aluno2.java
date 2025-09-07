import java.util.Random;

public class Aluno2 {
    // Atributos
    private String nome;
    private int idade;
    private double codigo_identificador;
    private Random aleatorio;

    // Construtor
    public Aluno2 (String nome, int idade) {
        aleatorio = new Random();
        this.nome = nome;
        this.idade = idade;
        this.codigo_identificador = aleatorio.nextDouble();
    }

    // Métodos
    public void setNome (String nome) {
        this.nome = nome;
    }
    public void setIdade (int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    public static void main(String[] args) {
        Aluno2 novoAluno = new Aluno2("João", 20);
        
        System.out.println("Nome do aluno: " + novoAluno.getNome());
        System.out.println("Idade do aluno: " + novoAluno.getIdade());
    }
}