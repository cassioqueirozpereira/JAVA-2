public class PessoaFisica {
    protected String nome;
    protected String CPF;

    public PessoaFisica ( String nome , String CPF ) {
        setNome(nome);;
        setCPF(CPF);
    }

    protected void setNome ( String nome ) {
        this.nome = nome;
    }

    protected String getNome ( ) {
        return this.nome;
    }

    protected void setCPF ( String CPF ) {
        if (validaCPF (CPF))
            this.CPF = CPF;
        else
            System.out.println("CPF inválido!");
    }

    protected String getCPF ( ) {
        return this.CPF;
    }

    private boolean validaCPF ( String CPF ) {
        // verifica sequência de digitos iguais e tamanho (11 digitos)
        if ( ! (CPF.chars(). allMatch(Character::isDigit))) {
            return false;
        }
        else if ((CPF.length() != 11) || CPF.matches("[0]{11}|[1]{11}|[2]{11}|[3]{11}|[4]{11}|[5]{11}|[6]{11}|[7]{11}|[8]{11}|[9]{11}"))
            return false;
        return true;
    }
}