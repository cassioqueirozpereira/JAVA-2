import java.util.Calendar;
import javax.swing.JOptionPane;

public class Main {
    private static Pessoa grupo[];
    public static void main(String args[]) {
        grupo = new Pessoa[2];
        grupo[0] = new Fisica(
            "Fulano da Silva",
            "Cidade Y",
            "Brasileira",
            "12345678900",
            Calendar.getInstance(),
            null
        );
        grupo[1] = new Pessoa(
            "Ciclano de Souza",
            "Cidade Z",
            "Brasileira",
            "98765432100",
            Calendar.getInstance(),
            null
        );
        
        StringBuilder mensagem = new StringBuilder();

        // Usando um loop "for-each"
        // for (Pessoa p : grupo) {
        //     mensagem.append(p.toString()).append("\n");
        // }

        // Usando um loop tradicional para incluir o número do objeto
        for (int i = 0; i < grupo.length; i++) {
            // Adiciona o número do objeto no início da string
            mensagem.append("Grupo[" + i + "]:   \n");
            // Adiciona as informações do objeto atual
            mensagem.append(grupo[i].toString()).append("\n\n");
        }
        
        JOptionPane.showMessageDialog(null, mensagem.toString());
    }
}