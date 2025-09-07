import java.util.Calendar;

public class Main {
    // Atributos
    private static int I1, I2, I3;
    private static String S1, S2, S3;
    private static Fisica P1, P2;
    private static Pessoa P3;

    // Métodos
    public static void main(String args[]) {
        // Instanciação dos objetos
        I1 = 1;
        I2 = 2;
        I3 = 1;
        S1 = "Texto A";
        S2 = "Texto B";
        S3 = "Texto A";
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1989, 10, 23);
        P1 = new Fisica(
            "Classe Fisica",
            "Cidade Y",
            "Brasileira",
            "12345678900",
            data_nasc,
            null
        );
        P2 = new Fisica(
            "Classe Fisica",
            "Cidade Y",
            "Brasileira",
            "12345678900",
            data_nasc,
            null
        );
        P3 = new Pessoa(
            "Classe Pessoa",
            null,
            null,
            null,
            Calendar.getInstance(),
            new Endereco("dos bobos", "nunca", "ninguém", "00000000000")
        );

        compararEquals(P1, P2, P3);
        compararEquals(I1, I2, I3);
        compararEquals(S1, S2, S3);
        System.out.println(P1.hashCode());
        System.out.println(P2.hashCode());
    }

    private static void compararEquals(Object o1, Object o2, Object o3) {
        System.out.println("Uso de EQUALS para comparar " + o1.getClass().getName());
        if (o1.equals(o2))
            System.out.println("o1 == o2");
        else
            System.out.println("o1 != o2");
        if (o1.equals(o3))
            System.out.println("o1 == o3");
        else
            System.out.println("o1 != o3");
    }
}