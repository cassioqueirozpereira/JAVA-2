import javax.swing.JOptionPane;

// Classe-mãe (Superclasse)
class Veiculo {
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "O veículo está acelerando...");
    }
}

// Subclasse que segue o LSP
class Carro extends Veiculo {
    @Override
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "O carro está acelerando rápido!");
    }
}

// Subclasse que segue o LSP
class Moto extends Veiculo {
    @Override
    public void acelerar() {
        JOptionPane.showMessageDialog(null, "A moto está acelerando de forma agressiva!");
    }
}

// Classe principal para testar
public class SegueLSP {
    
    public static void testarAceleracao(Veiculo veiculo) {
        veiculo.acelerar();
    }
    
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo minhaMoto = new Moto();
        
        testarAceleracao(meuCarro); 
        testarAceleracao(minhaMoto);
    }
}