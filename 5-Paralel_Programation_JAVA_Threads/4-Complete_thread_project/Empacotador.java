public class Empacotador implements Runnable {
    // Atributos
    private final Equipe equipe;
    private final ContadorSinc empacotamentos;
    private final String name;
    private String lista_threads_id;

    // Métodos
    public Empacotador(int nr_empacotador, Equipe equipe) {
        this.equipe = equipe;
        this.lista_threads_id = new String();
        this.name = "Empacotador [" + nr_empacotador + "]@" + equipe.getName();
        Thread.currentThread().setName(name);
        empacotamentos = new ContadorSinc(0);
    }

    public void listarIdThreads() {
        System.out.println(" |----- Lista de threads executadas por " + name + " : " + lista_threads_id);
    }

    public void listarEmpacotamentos() {
        System.out.println(" |----- Empacotamentos feitos por " + name + " : " + empacotamentos.getContador());
    }

    @Override
    public void run() {
        try {
            synchronized(lista_threads_id) {
                lista_threads_id = lista_threads_id + "[" + Thread.currentThread().getId() + "]"; // Constrói na instância de Empacotador uma lista com todas as threads que foram criadas.
            }
            System.out.println(name + "empacotamento (" + System.currentTimeMillis() + ")");
            Thread.sleep((int)(Math.random() * 899 + 100)); // Coloca a thread para dormir por um período aleatório entre 100 e 999 milissegundos.
            System.out.println(name + " concluiu (" + System.currentTimeMillis() + ")");
            empacotamentos.incrementar(); // Incrementa o contador de empacotamentos da instância de Empacotador.
            equipe.liberarFita();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}