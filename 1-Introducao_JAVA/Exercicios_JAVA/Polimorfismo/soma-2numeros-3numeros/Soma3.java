public class Soma3 extends Soma {
    // Atributo adicional para Soma3
    private int num3;

    // Construtor que recebe três números
    public Soma3(int num1, int num2, int num3) {
        super(num1, num2); // Chama o construtor da classe pai Soma
        this.num3 = num3;
    }

    // Método para calcular a soma de três números
    @Override
    public int calcularSoma() {
        return super.calcularSoma() + num3; // Soma os três números
    }
}