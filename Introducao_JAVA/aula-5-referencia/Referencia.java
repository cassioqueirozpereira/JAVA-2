public class Referencia {
    private Aluno a1, a2;
    public Referencia() {
        a1 = new Aluno("João", 20);
        a2 = new Aluno("Maria", 22);

        System.out.println("Nome do aluno 1: " + a1.getNome());
        System.out.println("Nome do aluno 2: " + a2.getNome());

        a2 = a1;
        
        a2.setNome("Carlos");
        System.out.println("Nome do aluno 1 após alteração: " + a1.getNome());

        manipulaAluno(a1);
        System.out.println("Nome do aluno 1 após manipulação: " + a1.getNome());
    }

    public void manipulaAluno(Aluno aluno) {
        aluno.setNome("Alterado");
    }

    public static void main(String[] args) {
        Referencia ref = new Referencia();
        System.out.println("Fim do programa.");
    }
}
