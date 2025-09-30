public class Main {
    public static void main(String[] args) {
        Maior maior = new Maior();

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Chamada 1: Encontrar o maior de 2 números
        int resultado2 = maior.maior(num1, num2);
        System.out.println("O maior entre " + num1 + " e " + num2 + " é: " + resultado2);

        System.out.println("---------------------------------------");

        // Chamada 2: Encontrar o maior de 3 números
        int resultado3 = maior.maior(num1, num2, num3);
        System.out.println("O maior entre " + num1 + ", " + num2 + " e " + num3 + " é: " + resultado3);
    }
}