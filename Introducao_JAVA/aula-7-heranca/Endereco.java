public class Endereco {
    // Atributos
    private String Pais;
    private String Estado;
    private String Cidade;
    private String Rua;
    private String Numero;
    private int CEP;
    private String Complemento;

    // Construtor
    // public Endereco() {
    //     this.Pais = "";
    //     this.Estado = "";
    //     this.Cidade = "";
    //     this.Rua = "";
    //     this.Numero = "";
    //     this.CEP = 0;
    //     this.Complemento = "";
    // }

    // Métodos
    public void setPais(String pais) {
        this.Pais = pais;
    }

    public String getPais() {
        return Pais;
    }

    public void setEstado(String estado) {
        this.Estado = estado;
    }

    public String getEstado() {
        return Estado;
    }

    public void setCidade(String cidade) {
        this.Cidade = cidade;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setRua(String rua) {
        this.Rua = rua;
    }

    public String getRua() {
        return Rua;
    }

    public void setNumero(String numero) {
        this.Numero = numero;
    }

    public String getNumero() {
        return Numero;
    }

    public void setCEP(int cep) {
        this.CEP = cep;
    }

    public int getCEP() {
        return CEP;
    }

    public void setComplemento(String complemento) {
        this.Complemento = complemento;
    }

    public String getComplemento() {
        return Complemento;
    }
}
