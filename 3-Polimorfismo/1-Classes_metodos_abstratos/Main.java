import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        StringBuilder resultados = new StringBuilder();

        Pessoa pessoa1 = new Fisica(100, "123.456.789-00");
        Pessoa pessoa2 = new Juridica(200, "12.345.678/0001-00");

        pessoa1.atualizarID();
        pessoa2.atualizarID();

        resultados.append("Novo ID da pessoa Física: " + pessoa1.recuperarID());
        resultados.append("\nNovo ID da pessoa Jurídica: " + pessoa2.recuperarID());

        JOptionPane.showMessageDialog(null, resultados.toString(), "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
}