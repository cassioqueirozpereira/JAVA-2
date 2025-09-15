import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        EstruturaDeDados estrutura = new FilaInt();

        // Inserir na fila
        estrutura.adicionar(10);
        estrutura.adicionar(20);
        estrutura.adicionar(30);

        // Exibir a fila
        estrutura.exibir();

        // Remover do início da fila(FIFO)
        estrutura.remover();

        // Exibir a fila após a remoção
        estrutura.exibir();

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com interface", JOptionPane.INFORMATION_MESSAGE);
    }
}