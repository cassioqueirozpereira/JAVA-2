import java.util.Calendar;
import javax.swing.JOptionPane;

public class Principal {
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

        // Constrói a mensagem a ser exibida
        String mensagem = "Nome: " + aluno.getNome() + "\n"
                        + "Idade: " + idade + "\n"
                        + "CPF: " + aluno.getCPF() + "\n"
                        + "Endereço: " + endereco.getRua() + ", "
                        + endereco.getNumero() + ", "
                        + endereco.getComplemento() + ", "
                        + endereco.getCidade() + ", "
                        + endereco.getEstado() + ", "
                        + endereco.getPais() + ", CEP: " + endereco.getCEP();

        // Exibe a mensagem em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, mensagem);
    }
}