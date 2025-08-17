public class Escola {
    // Atributos
    private String nome, CNPJ;
    private Endereco endereco;
    private List departamentos;
    private List discentes;

    // Construtor
    public Escola(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.departamentos = new ArrayList<Departamento>();
        this.discentes = new ArrayList<Aluno>();
    }

    // Métodos
    public void createDepartamento(String nomeDepartamento) {
        departamentos.add(new Departamento(nomeDepartamento));
    }

    public void closeDepartamento(Departamento departamento) {
        departamentos.remove(departamento);
    }

    public void enrollAluno(Aluno novoAluno) {
        discentes.add(novoAluno);
    }

    public void lockMatricula(Aluno aluno) {
        discentes.remove(aluno);
    }

    public void groupAluno () {
        Map<String, List<Aluno>> agrupamento = new HashMap<>();
        for (Aluno aluno : discentes) {
            if (!agrupamento.containsKey(aluno.getNaturalidade())) {
                agrupamento.put(aluno.getNaturalidade(), new ArrayList<>());
            }
            agrupamento.get(aluno.getNaturalidade()).add(aluno);
        }
    System.out.println("Resultado do agrupamento por naturalidade: " + agrupamento);
    }
}
