import java.util.Calendar;

public class Pessoa {
    // Atributos
    protected String nome, naturalidade, nacionalidade, identificador;
    private Calendar data_inicia_existencia;
    private int idade;
    private Endereco endereco;

    // Métodos
    public Pessoa ( String nome, String naturalidade, String nacionalidade, String identificador, Calendar data_inicia_existencia, Endereco endereco ) {
        setNome(nome);
        setNaturalidade(naturalidade);
        setNacionalidade(nacionalidade);
        setIdentificador(identificador);
        setData_inicia_existencia(data_inicia_existencia);
        setIdade(calculaIdade(data_inicia_existencia));
        setEndereco(endereco);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setData_inicia_existencia(Calendar data_inicia_existencia) {
        this.data_inicia_existencia = data_inicia_existencia;
    }

    public Calendar getData_inicia_existencia() {
        return data_inicia_existencia;
    }

    private int calculaIdade(Calendar data_inicia_existencia) {
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - data_inicia_existencia.get(Calendar.YEAR);
        if ( hoje.get(Calendar.MONTH) < data_inicia_existencia.get(Calendar.MONTH) ||
            ( hoje.get(Calendar.MONTH) == data_inicia_existencia.get(Calendar.MONTH) &&
              hoje.get(Calendar.DAY_OF_MONTH) < data_inicia_existencia.get(Calendar.DAY_OF_MONTH) ) ) {
            idade--;
        }
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void atualizarIdade() {
        setIdade(calculaIdade(data_inicia_existencia));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("        Nome: ").append(getNome()).append("\n");
        sb.append("        Naturalidade: ").append(getNaturalidade()).append("\n");
        sb.append("        Nacionalidade: ").append(getNacionalidade()).append("\n");
        sb.append("        Identificador: ").append(getIdentificador()).append("\n");
        sb.append("        Data de Início de Existência: ").append(
            String.format("%02d/%02d/%04d",
                getData_inicia_existencia().get(Calendar.DAY_OF_MONTH),
                getData_inicia_existencia().get(Calendar.MONTH) + 1,
                getData_inicia_existencia().get(Calendar.YEAR))
        ).append("\n");
        sb.append("        Idade: ").append(getIdade()).append(" anos\n");
        if (getEndereco() != null) {
            sb.append("        Endereço: ").append(getEndereco().toString()).append("\n");
        } else {
            sb.append("        Endereço: Não informado\n");
        }
        return sb.toString();
    }
}