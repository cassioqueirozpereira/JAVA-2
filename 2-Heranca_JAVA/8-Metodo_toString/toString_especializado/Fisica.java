import java.util.Calendar;

public class Fisica extends Pessoa {
    // Atributos

    // Métodos
    public Fisica ( String nome, String naturalidade, String nacionalidade, String CPF, Calendar data_nascimento, Endereco endereco ) {
        super(nome, naturalidade, nacionalidade, CPF, data_nascimento, endereco);
        atualizarIdade();
    }
}