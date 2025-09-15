import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        InstrumentoMusical instrumento1 = new Violao();
        InstrumentoMusical instrumento2 = new Flauta();

        output.append("Instrumento 1:\n");
        instrumento1.tocar();
        output.append("\nInstrumento 2:\n");
        instrumento2.tocar();

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com interface", JOptionPane.INFORMATION_MESSAGE);
    }
}