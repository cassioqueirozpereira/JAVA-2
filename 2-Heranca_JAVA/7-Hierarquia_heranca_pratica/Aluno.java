public class Aluno extends PessoaFisica {
    private String matricula;
    private String curso;

    public Aluno ( String nome , String CPF , String matricula , String curso ) {
        super(nome, CPF);
        setMatricula(matricula);
        setCurso(curso);
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    @Override
    public String toString() {
        return String.format("objID: %s => Nome: %s | CPF: %s | Matrícula: %s | Curso: %s\n",
        Integer.toHexString( this.hashCode()), nome, CPF, matricula, curso);
    }
}