import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        List<Acao> acoes = new ArrayList<>();
        acoes.add(new AcaoExibir("Executando ação 1"));
        acoes.add(new AcaoExibir("Isso é um exemplo de programação funcional."));

        // Usar programação funcional para executar as ações
        output.append("** Programação funcional para executar as ações **\n");
        acoes.forEach(Acao::executar);

        // Ou usando expressões lambda
        output.append("\n** Expressões lambda para executar as ações **\n");
        Consumer<Acao> execucao = acao -> acao.executar();
        acoes.forEach(execucao);

        JOptionPane.showMessageDialog(null, output.toString(), "Interfaces Funcionais", JOptionPane.INFORMATION_MESSAGE);
    }
}