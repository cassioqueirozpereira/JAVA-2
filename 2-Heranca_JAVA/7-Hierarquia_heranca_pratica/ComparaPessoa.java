import java.util.Comparator;

public class ComparaPessoa implements Comparator<PessoaFisica> {
    @Override
    public int compare(PessoaFisica p1, PessoaFisica p2) {
        // Retorna zero se os nomes forem iguais. Desconsidera maiúsculas/minúsculas.
        // Retorna valor negativo se p1 < p2 (ordem alfabética).
        // Retorna valor positivo se p1 > p2 (ordem alfabética).
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }
}