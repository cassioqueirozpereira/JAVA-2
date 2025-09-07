public class PessoaFisica {
    String CPF;
    String nome;

    public PessoaFisica(String CPF, String nome) {
        setCPF(CPF);
        setNome(nome);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCPF(String CPF) {
        if (validaCPF(CPF)) {
            this.CPF = CPF;
        }
        else
            System.out.println("CPF inválido");
    }

    public String getCPF() {
        return CPF;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.CPF == ((PessoaFisica) obj).CPF)
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return CPF.hashCode();
    }

    @Override
    public String toString() {
        return String.format("Classe: <%s> | Hash: %s", "PessoaFisica", Integer.toHexString(this.hashCode()).toUpperCase());
    }

    private boolean validaCPF(String CPF) {
        // Verifica sequencia de digitos iguais e tamanho (11 dígitos)
        if (! (CPF.chars().allMatch(Character::isDigit))) {
            System.out.println("CPF possui caracteres não numéricos!");
            return false;
        }
        else if ((CPF.length() != 11) || CPF.matches("[0]{11}|[1]{11}|[2]{11}|[3]{11}|[4]{11}|[5]{11}|[6]{11}|[7]{11}|[8]{11}|[9]{11}"))
            return false;
        return true;
    }
}
