// Conceito da função Math.max

public class Maior {
    public int maior(int num1, int num2) {
        // Usando expressão, somente para aprendizado. Pois é muito melhor o Math.max.
        // if (num1 > num2) retorne (?) num1 else (:) retorne num2
        return (num1 > num2) ? num1 : num2;
    }

    public int maior(int num1, int num2, int num3) {
        // Usando função
        return maior(num1, maior(num2, num3));
    }
}