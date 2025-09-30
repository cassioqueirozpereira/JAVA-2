public class Main {

    public static void main(String[] args) {
        
        // Instancia a única classe necessária
        Somar calc = new Somar();

        int x = 30, y = 25, z = 15;

        // Chamada 1: Passamos 2 argumentos. O Java escolhe o método soma(int a, int b)
        int resultado2 = calc.soma(x, y);
        System.out.println("Soma de " + x + " e " + y + ": " + resultado2);

        System.out.println("---------------------------------------");

        // Chamada 2: Passamos 3 argumentos. O Java escolhe o método soma(int a, int b, int c)
        int resultado3 = calc.soma(y, x, z);
        System.out.println("Soma de " + y + ", " + x + " e " + z + ": " + resultado3);
    }
}