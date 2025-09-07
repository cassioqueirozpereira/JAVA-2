import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    private static SortedSet<Aluno> conjunto_ordenado;
    
    public static void main(String[] args) {
        conjunto_ordenado = new TreeSet<Aluno>(new ComparaPessoa());
        
        conjunto_ordenado.add(new Aluno("João Silva", "12345678901", "2023001", "Engenharia"));
        conjunto_ordenado.add(new Aluno("Maria Souza", "10987654321", "2023002", "Medicina"));
        conjunto_ordenado.add(new Aluno("Ana Lima", "12312312399", "2023003", "Direito"));
        conjunto_ordenado.add(new Aluno("Carlos Pereira", "32132132100", "2023004", "Arquitetura"));
        
        JOptionPane.showMessageDialog(null, conjunto_ordenado.toString(), "Alunos Ordenados", JOptionPane.INFORMATION_MESSAGE);
    }
}