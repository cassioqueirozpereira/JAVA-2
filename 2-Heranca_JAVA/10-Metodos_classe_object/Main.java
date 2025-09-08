import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        StringBuilder resultados = new StringBuilder();

        PessoaFisica PF1 = new PessoaFisica("98765432100", "João");
        PessoaFisica PF2 = new PessoaFisica("12345678909", "João");
        PessoaFisica PF3 = new PessoaFisica("12345678909", "Maria");

        resultados.append("Comparando pessoas:\n");
        resultados.append("PF1 equals PF2: ").append(PF1.equals(PF2)).append("\n");
        resultados.append("PF1 equals PF3: ").append(PF1.equals(PF3)).append("\n");
        resultados.append("PF2 equals PF3: ").append(PF2.equals(PF3)).append("\n");
        resultados.append("PF2 == PF3: ").append(PF2 == PF3).append("\n");
        resultados.append("Hash da PF1: ").append(PF1.hashCode()).append("\n");
        resultados.append("Hash da PF2: ").append(PF2.hashCode()).append("\n");
        resultados.append("Hash da PF3: ").append(PF3.hashCode()).append("\n");
        resultados.append("ToString da PF1: ").append(PF1.toString()).append("\n");

        resultados.append("\n-------------------------------------------------------------------------------------\n\n");
        
        Aluno A1 = new Aluno("98765432100", "João", "2023001");
        Aluno A2 = new Aluno("98765432100", "João", "2023001");
        Aluno A3 = new Aluno("98765432100", "Maria", "2023002");

        resultados.append("Comparando alunos:\n");
        resultados.append("A1 equals A2: ").append(A1.equals(A2)).append("\n");
        resultados.append("A1 == A2: ").append(A1 == A2).append("\n");
        resultados.append("A1 equals A3: ").append(A1.equals(A3)).append("\n");
        resultados.append("A2 equals A3: ").append(A2.equals(A3)).append("\n");
        resultados.append("Hash do A1: ").append(A1.hashCode()).append("\n");
        resultados.append("Hash do A2: ").append(A2.hashCode()).append("\n");
        resultados.append("Hash do A3: ").append(A3.hashCode()).append("\n");
        resultados.append("ToString do A1: ").append(A1.toString()).append("\n");
        
        resultados.append("\n-------------------------------------------------------------------------------------\n\n");
        
        resultados.append("Comparando pessoas e alunos:\n");
        resultados.append("PF1 equals A1: ").append(PF1.equals(A1)).append("\n");
        resultados.append("PF1 == A1: ").append(PF1 == A1).append("\n");
        resultados.append("PF1 equals A2: ").append(PF1.equals(A2)).append("\n");
        resultados.append("A1 equals PF1: ").append(A1.equals(PF1)).append("\n");
        
        resultados.append("\n-------------------------------------------------------------------------------------\n");

        resultados.append("\n [PF1]: ").append(PF1).append("\n [PF2]: ").append(PF2).append("\n [PF3]: ").append(PF3).append("\n");

        resultados.append("\n-------------------------------------------------------------------------------------\n");

        resultados.append("\n [A1]: ").append(A1).append("\n [A2]: ").append(A2).append("\n [A3]: ").append(A3).append("\n");

        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados de Comparação", JOptionPane.INFORMATION_MESSAGE);
    }
}