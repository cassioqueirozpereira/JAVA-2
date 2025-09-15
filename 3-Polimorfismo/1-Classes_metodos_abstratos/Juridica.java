// Classe Juridica
class Juridica extends Pessoa {
    private String cnpj;

    public Juridica(int identificador, String cnpj) {
        super(identificador);
        this.cnpj = cnpj;
    }

    @Override
    public void atualizarID() {
        identificador += 2;
    }

    public String getCNPJ() {
        return cnpj;
    }
}