public class Maior_3 extends Maior_2 {
    // Atributos
    private int num1;
    private int num2;
    private int num3;

    // Construtor
    public Maior_3(int num1, int num2, int num3) {
        super(num1, num2);
        this.num3 = num3;
    }

    // Método para retornar o maior número entre os três
    public int maior() {

        // Usando if-else
        // if (super.maior() > num3)
        //     return super.maior();
        // else
        //     return num3;

        // Usando operador ternário
        return (super.maior() > num3) ? super.maior() : num3;
    }
}