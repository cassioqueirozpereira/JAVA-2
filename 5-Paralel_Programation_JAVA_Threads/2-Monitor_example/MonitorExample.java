public class MonitorExample {
    // Recurso compartilhado
    private int contador = 0;

    // Método sincronizado (monitor)
    public synchronized void incrementar() {
        // Simula algum processamento
        contador++;
        System.out.println("Contador incrementado para: " + contador);
    }

    public static void main(String[] args) {
        // Criando a instância do monitor
        MonitorExample monitor = new MonitorExample();

        // Criando threads que vão acessar o método sincronizado
        Thread t1 = new Thread(new Tarefa(monitor), "Thread 1");
        Thread t2 = new Thread(new Tarefa(monitor), "Thread 2");

        // Iniciando as threads
        t1.start();
        t2.start();
    }

    // Classe interna para representar a tarefa das threads
    static class Tarefa implements Runnable {
        private MonitorExample monitor;

        public Tarefa(MonitorExample monitor) {
            this.monitor = monitor;
        }

        @Override
        public void run() {
            // As threads tentam acessar o método sincronizado
            monitor.incrementar();
        }
    }
}