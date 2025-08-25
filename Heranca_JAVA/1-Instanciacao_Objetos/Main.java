import javax.swing.JOptionPane;
import java.util.UUID;

public class Main {
    public static void main ( String[] args ) {
        // Bloco Aluno
        Aluno aluno1 = new Aluno ( "Cassio" , "Brasileiro" , "Paranaense" );
        String mensagemAluno = "Nome: " + aluno1.getNome ( ) + "\n"
                             + "Nacionalidade: " + aluno1.getNacionalidade ( ) + "\n"
                             + "Naturalidade: " + aluno1.getNaturalidade ( ) + "\n"
                             + "Matricula: " + aluno1.matricula;
        JOptionPane.showMessageDialog(null, mensagemAluno, "Detalhes do Aluno", JOptionPane.INFORMATION_MESSAGE);
        
        // Bloco Juridica
        Juridica empresa1 = new Juridica ( "Empresa X" , "Brasileira" , "Paulista" , "12345678910112" );
        String mensagemEmpresa;
        if (empresa1.getCNPJ() == null) {
            mensagemEmpresa = "CNPJ inválido!";
        } else {
            mensagemEmpresa = "Nome: " + empresa1.getNome ( ) + "\n"
                            + "Nacionalidade: " + empresa1.getNacionalidade ( ) + "\n"
                            + "Naturalidade: " + empresa1.getNaturalidade ( ) + "\n"
                            + "CNPJ: " + empresa1.getCNPJ();
        }
        JOptionPane.showMessageDialog(null, mensagemEmpresa, "Detalhes da Empresa", JOptionPane.INFORMATION_MESSAGE);

        // Bloco Fisica
        Fisica pessoa1 = new Fisica ( "Dilnara" , "Brasileira" , "Paranaense" , "12345678910" );
        String mensagemPessoa;
        if (pessoa1.getCPF() == null) {
            mensagemPessoa = "CPF inválido!";
        } else {
            mensagemPessoa = "Nome: " + pessoa1.getNome ( ) + "\n"
                           + "Nacionalidade: " + pessoa1.getNacionalidade () + "\n"
                           + "Naturalidade: " + pessoa1.getNaturalidade ( ) + "\n"
                           + "CPF: " + pessoa1.getCPF();
        }
        JOptionPane.showMessageDialog(null, mensagemPessoa, "Detalhes da Pessoa", JOptionPane.INFORMATION_MESSAGE);
    }
}