import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class ExceptionChain {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        try {
            List<String> Nomes = new ArrayList<>();
            addNome(Nomes, null);
        } catch (ExceptionInvalidName e) {
            output.append("Error: " + e.getMessage());
            output.append("\n\nRoot cause: " + e.getCause().getMessage());
            JOptionPane.showMessageDialog(null, output.toString(), "Tratamento de exceções", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void addNome(List<String> nomes, String nome) throws ExceptionInvalidName {
        try {
            if (nome == null || nome.isEmpty()) {
                throw new IllegalArgumentException("The name cannot be null or empty");
            }
            nomes.add(nome);
        } catch (IllegalArgumentException e) {
            throw new ExceptionInvalidName("Was detected a invalid name", e);
        }
    }
}