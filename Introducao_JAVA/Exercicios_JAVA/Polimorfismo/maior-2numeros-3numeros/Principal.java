public class Principal {
    // Atributos
    private static Maior_2 maior2;
    private static Maior_3 maior3;

    // Método principal
    public static void main(String[] args) {
        int x = 30, y = 25, z = 15;
        maior2 = new Maior_2(x, y);
        System.out.println("Maior entre " + x + " e " + y + ": " + maior2.maior());
        maior3 = new Maior_3(y, x, z);
        System.out.println("Maior entre " + y + ", " + x + " e " + z + ": " + maior3.maior());
    }
}