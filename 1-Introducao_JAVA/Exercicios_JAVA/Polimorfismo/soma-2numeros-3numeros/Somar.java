// A classe que contém toda a lógica de soma
public class Somar {

    // 1. Método Sobrecarragado: Soma de 2 números
    // Assinatura: soma(int, int)
    public int soma(int a, int b) {
        System.out.println("Executando a soma de DOIS números...");
        return a + b;
    }

    // 2. Método Sobrecarragado: Soma de 3 números
    // Assinatura: soma(int, int, int)
    public int soma(int a, int b, int c) {
        System.out.println("Executando a soma de TRÊS números...");
        return a + b + c;
    }
}