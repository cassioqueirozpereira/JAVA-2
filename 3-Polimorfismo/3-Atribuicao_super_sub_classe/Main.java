// public class Main {
//     // Atributos
//     private static Derivada ref;

//     // Métodos
//     public static void main(String[] args) {
//         ref = new Derivada();
//         System.out.println("=> Imprime o valor de var_base");
//         ref.imprimirVarBase();
//         System.out.println("=> Atualiza o valor de var_der com downcasting (var_der = 1000)");
//         ref.atualizarVarSub(1000);
//         System.out.println("=> Imprime o valor de var_der com downcasting");
//         ref.imprimirVarSub();
//         System.out.println("=> Imprime o valor de var_der");
//         ref.imprimirVarDer();
//     }
// }

import javax.swing.JOptionPane;

public class Main {
    // Atributos
    private static Derivada ref;
    public static StringBuilder output = new StringBuilder();

    // Métodos
    public static void main(String[] args) {
        ref = new Derivada();

        output.append("=> Imprime o valor de var_base\n");
        ref.imprimirVarBase();

        output.append("=> Atualiza o valor de var_der com downcasting (var_der = 1000)\n");
        ref.atualizarVarSub(1000);

        output.append("=> Imprime o valor de var_der com downcasting\n");
        ref.imprimirVarSub();

        output.append("=> Imprime o valor de var_der\n");
        ref.imprimirVarDer();

        JOptionPane.showMessageDialog(null, output.toString());
    }
}