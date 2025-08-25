// O JOptionPane é uma classe do Java que facilita a criação de janelas de diálogo (pequenas janelas pop-up) para interagir com o usuário de uma forma simples. Ele faz parte da biblioteca Swing do Java, que é usada para criar interfaces gráficas de usuário (GUIs).

// Em vez de você ter que construir uma janela do zero, o JOptionPane já vem com vários tipos de janelas prontas, como:

//     Caixas de mensagem: Para exibir informações ao usuário.

//     Caixas de entrada: Para pedir que o usuário digite algo.

//     Caixas de confirmação: Para fazer uma pergunta de sim/não ou ok/cancelar.

// Principais métodos do JOptionPane

// Você usa o JOptionPane chamando seus métodos estáticos, o que significa que não precisa criar um objeto da classe para usá-lo (new JOptionPane()).

//     JOptionPane.showMessageDialog()

//         Função: Exibe uma mensagem para o usuário.

//         Exemplo: JOptionPane.showMessageDialog(null, "Olá, mundo!");

//     JOptionPane.showInputDialog()

//         Função: Pede uma entrada de texto do usuário e retorna a string que ele digitou.

//         Exemplo: String nome = JOptionPane.showInputDialog("Qual é o seu nome?");

//     JOptionPane.showConfirmDialog()

//         Função: Exibe uma pergunta com botões como "Sim", "Não" e "Cancelar". Retorna um valor inteiro que indica qual botão foi pressionado.

//         Exemplo: int resposta = JOptionPane.showConfirmDialog(null, "Você quer continuar?");

import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        int resposta = 0;
        int A, B, resultado;

        while (resposta == 0) {
            A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A:"));
            B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B:"));

            resultado = (A * B);

            JOptionPane.showMessageDialog(null, "A multiplicação de " + A + " X " + B + " é: " + resultado);

            resposta = JOptionPane.showConfirmDialog(null, "Você quer continuar?");
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado!");
        System.exit(0);
    }
}