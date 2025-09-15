import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {

        // Criando objetos de diferentes tipos de veículos
        Veiculo veiculo1 = new Carro("Toyota");
        Veiculo veiculo2 = new Moto("Honda");

        // Chamando métodos polimórficos
        output.append("Veículo 1\n");
        veiculo1.acelerar();
        veiculo1.frear();
        output.append("\nVeiculo 2\n");

        veiculo2.acelerar();
        veiculo2.frear();

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com abstract", JOptionPane.INFORMATION_MESSAGE);
    }
}