import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Duck"));
        animais.add(new Gato("Sunday"));
        animais.add(new Pato("Donald"));

        // Usando programação funcional para filtrar e manipular animais
        output.append("Animais com nomes curtos: \n");
        animais.stream()
            .filter(animal -> animal.getNome().length() < 5)
            .forEach(animal -> output.append(animal.getNome() + ": " + animal.emitirSom() + "\n"));

        output.append("\nAnimais que emitem som de 5 letras: \n");
        animais.stream()
            .filter(animal -> animal.emitirSom().length() == 5)
            .forEach(animal -> output.append(animal.getNome() + ": " + animal.emitirSom() + "\n"));

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com interface", JOptionPane.INFORMATION_MESSAGE);
    }
}