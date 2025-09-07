public class Pessoa {
    //Atributos
    protected String identificador;
    protected String nome , nacionalidade , naturalidade;
        
    //Métodos
    public Pessoa ( String nome , String nacionalidade , String naturalidade ) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
    }
    protected void setNome ( String nome ) {
        this.nome = nome;
    }
    protected String getNome ( ) {
        return this.nome;
    }
    protected String getNacionalidade ( ) {
        return this.nacionalidade;
    }
    protected String getNaturalidade ( ) {
        return this.naturalidade;
    }

    protected void setIdentificador ( String identificador ) {
        this.identificador = identificador;
    }

    protected String getIdentificador ( ) {
        return this.identificador;
    }
}