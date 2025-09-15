// Classe Fisica
class Fisica extends Pessoa {
    private String cpf;

    public Fisica(int identificador, String cpf) {
        super(identificador);
        this.cpf = cpf;
    }

    @Override
    public void atualizarID() {
        identificador += 1;
    }

    public String getCPF() {
        return cpf;
    }
}