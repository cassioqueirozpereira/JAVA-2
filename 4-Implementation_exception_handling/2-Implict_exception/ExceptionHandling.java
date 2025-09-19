
// public class ExceptionHandling {
//     public static void main(String[] args) {
//         StringBuilder output = new StringBuilder();
//         int quociente, dividendo = 10, divisor = 0;
// public class Principal {
//     public static void main(String[] args) {
//         int divisor, dividendo, quociente;

//         try {
//             if (divisor == 0)
//                 throw new ArithmeticException("Divisor é zero.");
//             // A JVM lançará implicitamente uma ArithmeticException aqui, pois divisor é 0.
//             quociente = dividendo / divisor;

//             output.append("O quociente é: " + quociente);
//         } catch (Exception e) {
//             output.append("ERRO: Divisão por zero: " + e.getMessage());
//         }

//         JOptionPane.showMessageDialog(null, output.toString(), "Tratamento de exceções", JOptionPane.INFORMATION_MESSAGE);
//     }
// }


// Método usando o comando para executar o arquivo, "java ExceptionHandling.java" (Lembrando tem que estar no diretório/pasta, onde está o arquivo)
// import java.util.Scanner;
// public class ExceptionHandling {
//     public static void main ( String args [ ] ) throws InterruptedException {
//         int divisor , dividendo , quociente = 0;
//         String controle = "s";
        
//         Scanner s = new Scanner ( System.in );
//         do {    
//             System.out.println( "Entre com o dividendo." );
//             dividendo = s.nextInt();
//             System.out.println( "Entre com o divisor." );
//             divisor = s.nextInt();
//             quociente = dividendo / divisor;
//             System.out.println( "O quociente é: " + quociente );
//             System.out.println( "Repetir?" );
//             controle = s.next().toString();
//         } while ( controle.equals( "s" ) );
//         s.close();
//     }
// }

// }


import javax.swing.JOptionPane;

public class ExceptionHandling {
    public static void main(String[] args) {
        String controle;

        do {
            try {
                // Entrada de dados usando JOptionPane
                String strDividendo = JOptionPane.showInputDialog("Entre com o dividendo.");
                String strDivisor = JOptionPane.showInputDialog("Entre com o divisor.");
                
                // Trata o caso do usuário clicar em "Cancelar" ou fechar a caixa de diálogo
                if (strDividendo == null || strDivisor == null) {
                    break; // Sai do loop principal
                }

                int dividendo = Integer.parseInt(strDividendo);
                int divisor = Integer.parseInt(strDivisor);

                // Lança a exceção de forma explícita se o divisor for zero
                if (divisor == 0) {
                    throw new ArithmeticException("Divisor é zero.");
                }

                // Calcula o quociente e exibe o resultado
                int quociente = dividendo / divisor;
                
                // Usa StringBuilder para fins educacionais
                StringBuilder mensagem = new StringBuilder();
                mensagem.append("O quociente é: ").append(quociente);
                
                JOptionPane.showMessageDialog(null, mensagem.toString());

            } catch (NumberFormatException e) {
                // Captura a exceção se o usuário digitar algo que não é um número
                JOptionPane.showMessageDialog(null, "Erro! Por favor, digite apenas números inteiros.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            } catch (ArithmeticException e) {
                // Captura a exceção lançada explicitamente
                JOptionPane.showMessageDialog(null, "Erro! " + e.getMessage(), "Erro de Cálculo", JOptionPane.ERROR_MESSAGE);
            }

            // Bloco de validação da resposta de repetição
            do {
                controle = JOptionPane.showInputDialog("Repetir? (sim/não)");

                if (controle == null) {
                    controle = "não";
                }

                if (!controle.equalsIgnoreCase("sim") && !controle.equalsIgnoreCase("não")) {
                    JOptionPane.showMessageDialog(null, "Resposta inválida. Por favor, digite 'sim' ou 'não'.");
                }
            } while (!controle.equalsIgnoreCase("sim") && !controle.equalsIgnoreCase("não"));
            
        } while (controle.equalsIgnoreCase("sim"));
    }
}