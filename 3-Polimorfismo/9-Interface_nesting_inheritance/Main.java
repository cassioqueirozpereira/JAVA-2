import javax.swing.JOptionPane;

public class Main {
    public static StringBuilder output = new StringBuilder();
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.acelerar();

        // Criando um objeto da classe interna
        Carro.MotorCarro motorCarro = carro.new MotorCarro();
        motorCarro.ligar();
        motorCarro.desligar();

        JOptionPane.showMessageDialog(null, output.toString(), "Polimorfismo com interface aninhada", JOptionPane.INFORMATION_MESSAGE);
    }
}