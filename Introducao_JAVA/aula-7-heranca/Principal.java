import java.util.Calendar;

public class Main {
    //Atributos
    private static Aluno aluno;
    private static Endereco endereco;
    //Método main
    public static void main (String args[]) {
        int idade;
        Calendar data = Calendar.getInstance();
        data.set(2007, 07, 07);
        endereco = new Endereco ();
        endereco.setPais("Brasil");
        endereco.setEstado("Ceará");
        endereco.setCidade ("Rio de Janeiro");
        endereco.setRua("rua Canuto de Aguiar");
        endereco.setNumero("176");
        endereco.setCEP(20252060);
        endereco.setComplemento("Ap 307");
        // O sufixo 'L' é usado para indicar que o número é do tipo long
        aluno = new Aluno ("Maria", data, 12345687700L, endereco);
        aluno.setIdade();
        idade = aluno.getIdade();

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + aluno.getCPF());
        System.out.println("Endereço: " + endereco.getRua() + ", " + endereco.getNumero() + ", " + endereco.getComplemento() + ", " + endereco.getCidade() + ", " + endereco.getEstado() + ", " + endereco.getPais() + ", CEP: " + endereco.getCEP());
    }
}