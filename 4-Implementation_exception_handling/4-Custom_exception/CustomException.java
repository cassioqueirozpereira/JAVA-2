import javax.swing.JOptionPane;

public class CustomException {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        try {
            int resultado = divisao(20, 0);
            output.append("O resultado da divisão é: " + resultado);
            JOptionPane.showMessageDialog(null, output.toString(), "Tratamento de exceções", JOptionPane.INFORMATION_MESSAGE);
        } catch (CustomExceptionDivideByZero e) {
            output.append("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, output.toString(), "Tratamento de exceções", JOptionPane.INFORMATION_MESSAGE);

        }
    }

    public static int divisao(int dividendo, int divisor) throws CustomExceptionDivideByZero {
        if (divisor == 0) {
            throw new CustomExceptionDivideByZero("O divisor não pode ser zero");
        }
        return dividendo / divisor;
    }
}