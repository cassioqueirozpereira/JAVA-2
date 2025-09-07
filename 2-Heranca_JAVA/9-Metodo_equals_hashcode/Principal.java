import java.util.Calendar;

public class Principal {
    // Atributos
    private static Pessoa p1, p3;
    private static Fisica p2;

    // Métodos
    public static void main(String args[]) {
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1989, 10, 23);
        p1 = new Fisica(
            "Classe Fisica",
            "Cidade Y",
            "Brasileira",
            "12345678900",
            data_nasc,
            null
        );
        p2 = new Fisica(
            "Classe Fisica",
            "Cidade Y",
            "Brasileira",
            "12345678900",
            data_nasc,
            null
        );
        p3 = new Pessoa(
            "Classe Pessoa",
            null,
            null,
            null,
            Calendar.getInstance(),
            new Endereco("dos bobos", "nunca", "ninguém", "00000000000")
        );
        if (p1 instanceof Pessoa)
            System.out.println("p1 é instância do tipo Pessoa");
        else
            System.out.println("p1 não é instância do tipo Pessoa");
        
        if (p2 instanceof Pessoa)
            System.out.println("p2 é instância do tipo Pessoa");
        else
            System.out.println("p2 não é instância do tipo Pessoa");
        
        if (p3 instanceof Pessoa)
            System.out.println("p3 é instância do tipo Pessoa");
        else
            System.out.println("p3 não é instância do tipo Pessoa");
        
        if (p3 instanceof Fisica)
            System.out.println("p3 é instância do tipo Fisica");
        else
            System.out.println("p3 não é instância do tipo Fisica");
    }
}
