import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main (String[] args) {
        CienciaDeDados profissional1 = new AnalistaDeDados();
        CienciaDeDados profissional2 = new CientistaDeDados();

        output.append("Profissional 1:\n");
        profissional1.analisarDados();
        profissional1.processarDados();

        output.append("\nProfissional 2:\n");
        profissional2.analisarDados();
        profissional2.processarDados();

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com interface", JOptionPane.INFORMATION_MESSAGE);
    }
}