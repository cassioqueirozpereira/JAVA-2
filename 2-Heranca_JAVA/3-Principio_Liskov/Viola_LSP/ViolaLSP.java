// Por que isso viola o Princípio de Liskov?

// O método testarAreaRetangulo foi projetado para funcionar com qualquer Retangulo, esperando um comportamento previsível: se a largura é 5 e a altura é 10, a área será 50.

// No entanto, quando você "substitui" o Retangulo pelo Quadrado, o comportamento muda. O Quadrado "mexe" na largura quando você tenta mudar a altura, e vice-versa. Essa lógica "extra" do Quadrado quebra a expectativa do método testarAreaRetangulo, resultando em um erro de cálculo.

// O princípio de Liskov diz que o Quadrado deveria se comportar como um Retangulo em qualquer contexto, mas ele não faz isso, provando que ele não é um substituto válido para a classe pai neste cenário.

import javax.swing.JOptionPane;

// Classe-mãe
class Retangulo {
    protected int largura;
    protected int altura;

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getArea() {
        return largura * altura;
    }
}

// Subclasse que viola o LSP
class Quadrado extends Retangulo {
    @Override
    public void setLargura(int lado) {
        this.largura = lado;
        this.altura = lado;
    }

    @Override
    public void setAltura(int lado) {
        this.largura = lado;
        this.altura = lado;
    }
}

// Classe principal para testar
public class ViolaLSP {

    public static void testarAreaRetangulo(Retangulo retangulo) {
        retangulo.setLargura(5);
        retangulo.setAltura(10);
        
        String mensagem = "Área esperada: " + (5 * 10) + ", Área real: " + retangulo.getArea();
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public static void main(String[] args) {
        Retangulo meuRetangulo = new Retangulo();
        Retangulo meuQuadrado = new Quadrado();

        testarAreaRetangulo(meuRetangulo);
        testarAreaRetangulo(meuQuadrado);
    }
}