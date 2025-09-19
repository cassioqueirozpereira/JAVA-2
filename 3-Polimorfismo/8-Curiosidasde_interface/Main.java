import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        Base b = new Base();
        b.getNome();

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com interface", JOptionPane.INFORMATION_MESSAGE);
    }
}