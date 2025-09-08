import java.util.Objects;

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
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Aluno other = (Aluno) obj;
        return Objects.equals(this.CPF, other.CPF) && Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.CPF, this.matricula);
    }

    @Override
    public String toString() {
        return String.format("Classe: <%s> | Hash: %s", "Aluno", Integer.toHexString(this.hashCode()).toUpperCase());
    }
}