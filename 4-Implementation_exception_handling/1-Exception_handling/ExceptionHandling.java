import javax.swing.JOptionPane;

public class ExceptionHandling {
    public static int divisao(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    public static void main(String[] args) {
        StringBuilder output = new StringBuilder();

        try {
            int resultado = divisao(10, 0);
            output.append("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            output.append("Erro: Divisão por zero não é permitida.");
        }

        JOptionPane.showMessageDialog(null, output.toString(), "Tratamento de exceções", JOptionPane.INFORMATION_MESSAGE);
    }
}