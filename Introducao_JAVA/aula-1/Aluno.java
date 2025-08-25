public class Aluno {
    private String nome;
    public void setNome(String nn) {
        nome = nn;
    }
    public String getNome() {   
        return nome;
    }
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.setNome("Pessoa");
        System.out.println("saida: " + a.getNome());
    }
}