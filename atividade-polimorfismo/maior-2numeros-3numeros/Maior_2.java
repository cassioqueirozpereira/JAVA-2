public class Maior_2 {
    // Atributos
    private int num1;
    private int num2;

    // Construtor
    public Maior_2(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método para retornar o maior número entre os dois
    public int maior() {
        // Usando if-else
        // if (num1 > num2)
        //     return num1;
        // else
        //     return num2;

        // Operador ternário
        // A condição (num1 > num2) é avaliada.
        // O símbolo ? introduz o valor a ser retornado caso a condição seja verdadeira. Neste caso, se num1 for maior que num2, o valor de num1 é retornado.
        // O símbolo : introduz o valor a ser retornado caso a condição seja falsa. Neste caso, se num1 não for maior que num2, o valor de num2 é retornado.
        return (num1 > num2) ? num1 : num2;
    }
}