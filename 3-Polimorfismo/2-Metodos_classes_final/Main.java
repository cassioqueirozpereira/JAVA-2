import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        StringBuilder resultados = new StringBuilder();

        Pessoa pessoa = new Fisica(100);

        resultados.append("ID inicial: " + pessoa.recuperarID());
        pessoa.atualizarID();
        resultados.append("\nID atualizado: " + pessoa.recuperarID());

        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}