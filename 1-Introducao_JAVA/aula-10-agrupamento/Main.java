public class Main {
    // Atributos
    private static Aluno aluno1, aluno2, aluno3, aluno4, aluno5, aluno6, aluno7, aluno8, aluno9, aluno10;
    private static Escola escola;

    // Método main
    public static void main(String[] args) {
        escola = new Escola("Escola de Exemplo", "12.345.678/0001-90");
        createAlunos();
        enrollAlunos();
        escola.groupAluno();
    }

    // Método para criar alunos
    private static void createAlunos() {
        aluno1 = new Aluno("Alice", "São Paulo");
        aluno2 = new Aluno("Bob", "Rio de Janeiro");
        aluno3 = new Aluno("Charlie", "São Paulo");
        aluno4 = new Aluno("David", "Belo Horizonte");
        aluno5 = new Aluno("Eve", "São Paulo");
        aluno6 = new Aluno("Frank", "Curitiba");
        aluno7 = new Aluno("Grace", "São Paulo");
        aluno8 = new Aluno("Heidi", "Rio de Janeiro");
        aluno9 = new Aluno("Ivan", "Belo Horizonte");
        aluno10 = new Aluno("Judy", "Curitiba");
    }

    // Método para matricular alunos na escola
    private static void enrollAlunos() {
        escola.enrollAluno(aluno1);
        escola.enrollAluno(aluno2);
        escola.enrollAluno(aluno3);
        escola.enrollAluno(aluno4);
        escola.enrollAluno(aluno5);
        escola.enrollAluno(aluno6);
        escola.enrollAluno(aluno7);
        escola.enrollAluno(aluno8);
        escola.enrollAluno(aluno9);
        escola.enrollAluno(aluno10);
    }
}
