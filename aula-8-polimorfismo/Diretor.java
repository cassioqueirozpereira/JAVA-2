import java.util.Calendar;
import java.util.UUID;

public class Diretor extends Empregado {
    //Métodos
    public Diretor(String nome, Calendar data_nascimento, long CPF, Endereco endereco) {
        super(nome, data_nascimento, CPF, endereco);
    }

    protected void gerarMatricula() {
        this.matricula = "Diretor-" + UUID.randomUUID().toString();
    }

    protected void alterarMatricula() {
        this.gerarMatricula();
    }

    protected void alterarMatricula(String matricula) {
        this.matricula = matricula;
    }
}