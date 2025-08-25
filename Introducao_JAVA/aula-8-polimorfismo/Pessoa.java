import java.util.Calendar;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private Calendar data_nascimento;
    private long CPF;
    private Endereco endereco;

    // Construtor
    public Pessoa ( String nome , Calendar data_nascimento , long CPF , Endereco endereco ) {
        this.setNome ( nome );
        this.data_nascimento = data_nascimento;
        this.setCPF ( CPF );
        this.setEndereco ( endereco );
        setIdade();
    }

    // Métodos
    protected void setNome ( String nome ) {
        this.nome = nome;
    }

    protected String getNome () {
        return nome;
    }

    protected void setCPF ( long CPF ) {
        this.CPF = CPF;
    }

    protected long getCPF () {
        return CPF;
    }

    protected void setEndereco ( Endereco endereco ) {
        this.endereco = endereco;
    }

    protected Endereco getEndereco () {
        return endereco;
    }

    protected void setIdade() {
        this.idade = calcularIdade();
    }

    protected int getIdade () {
        return idade;
    }

    private int calcularIdade () {
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get ( Calendar.YEAR ) - data_nascimento.get ( Calendar.YEAR );
        if ((data_nascimento.get (Calendar.MONTH) > hoje.get (Calendar.MONTH)) || (data_nascimento.get (Calendar.MONTH) == hoje.get (Calendar.MONTH) && data_nascimento.get(Calendar.DATE) > hoje.get (Calendar.DATE)))
            lapso--;
        return lapso;
    }
}