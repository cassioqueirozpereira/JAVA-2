public class Principal {
    // Atributos
    private static Soma soma;
    private static Soma3 soma3;

    // Método principal
    public static void main(String[] args) {
        soma = new Soma(5, 10);
        System.out.println("Soma de dois números: " + soma.calcularSoma());

        soma3 = new Soma3(5, 10, 15);
        System.out.println("Soma de três números: " + soma3.calcularSoma());
    }
}