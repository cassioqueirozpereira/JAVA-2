public class Aluno extends PessoaFisica {
    String matricula;

    public Aluno(String CPF, String nome, String matricula) {
        super(CPF, nome);
        setMatricula(matricula);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public boolean equals(Object obj) {
        if ((this.CPF == ((Aluno) obj).CPF) && (this.matricula == ((Aluno) obj).matricula))
            return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return (this.CPF + this.matricula).hashCode();
    }

    @Override
    public String toString() {
        return String.format("Classe: <%s> | Hash: %s", "Aluno", Integer.toHexString(this.hashCode()).toUpperCase());
    }
}
