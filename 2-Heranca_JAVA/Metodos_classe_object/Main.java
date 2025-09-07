public class Main {
    public static void main(String[] args) {
        PessoaFisica PF1 = new PessoaFisica("12345678909", "João");
        PessoaFisica PF2 = new PessoaFisica("98765432100", "João");
        PessoaFisica PF3 = new PessoaFisica("12345678909", "Maria");

        System.out.println("Comparando pessoas:");
        System.out.println("PF1 equals PF2: " + PF1.equals(PF2));
        System.out.println("PF1 equals PF3: " + PF1.equals(PF3));
        System.out.println("PF2 equals PF3: " + PF2.equals(PF3));
        System.out.println("Hash da PF1: " + PF1.hashCode());
        System.out.println("Hash da PF2: " + PF2.hashCode());
        System.out.println("Hash da PF3: " + PF3.hashCode());
        System.out.println("ToString da PF1: " + PF1.toString());

        System.out.println("\n--------------------------------------------------\n");
        
        Aluno A1 = new Aluno("12345678909", "João", "2023001");
        Aluno A2 = new Aluno("12345678909", "João", "2023001");
        Aluno A3 = new Aluno("12345678909", "Maria", "2023002");

        System.out.println("Comparando alunos:");
        System.out.println("A1 equals A2: " + A1.equals(A2));
        System.out.println("A1 equals A3: " + A1.equals(A3));
        System.out.println("A2 equals A3: " + A2.equals(A3));
        System.out.println("Hash do A1: " + A1.hashCode());
        System.out.println("Hash do A2: " + A2.hashCode());
        System.out.println("Hash do A3: " + A3.hashCode());
        System.out.println("ToString do A1: " + A1.toString());
        
        System.out.println("\n--------------------------------------------------\n");
        
        System.out.println("Comparando pessoas e alunos:");
        System.out.println("PF1 equals A1: " + PF1.equals(A1));
        System.out.println("PF1 == A2: " + (PF1 == A2));
        System.out.println("PF1 equals PF2: " + PF1.equals(A2));
        System.out.println("PF2 equals A3: " + PF1.equals(A3));

                //Imprime o identificador do objeto
        System.out.println ( "[PF1]: "+ PF1 + " [PF2]: " + PF2 + " [PF3]: " + PF3 );
        System.out.println ( "[A1]: " + A1 + " [A2]: " + A2 + " [A3]: " + A3 );
    }
}