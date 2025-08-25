import java.util.Calendar;

public class Principal {
    // Atributos
    private static Empregado empregado;
    private static Diretor diretor;

    // Método main
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        data.set(1980, 10, 23);
        empregado = new Empregado("João", data, 12345678901L, null);
        empregado.gerarMatricula();
        diretor = new Diretor("Maria", data, 10987654321L, null);
        diretor.gerarMatricula();

        System.out.println("Matrícula do empregado: " + empregado.recuperarMatricula());
        System.out.println("Matrícula do diretor: " + diretor.recuperarMatricula());
        diretor.alterarMatricula();
        System.out.println("Matrícula nova do diretor: " + diretor.recuperarMatricula());
        diretor.alterarMatricula("123");
        System.out.println("Matrícula nova do diretor: " + diretor.recuperarMatricula());
    }
}
