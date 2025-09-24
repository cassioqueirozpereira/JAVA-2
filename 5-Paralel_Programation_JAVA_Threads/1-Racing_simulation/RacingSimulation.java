import java.util.concurrent.Semaphore;

public class RacingSimulation {
    // Criação de um semáforo com 1 permissão(simulando um recurso único)
    static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        // Criando duas threads que tentam acessar o recurso
        Thread t1 = new Thread(new Tarefa(), "Thread 1");
        Thread t2 = new Thread(new Tarefa(), "Thread 2");

        // Iniciando as threads
        t1.start();
        t2.start();
    }

    static class Tarefa implements Runnable {
        @Override
        public void run() {
            try {
                // Tentando adquirir o semáforo
                System.out.println(Thread.currentThread().getName() + " tentando acessar o recurso...");
                semaphore.acquire(); // Adquire o recurso, decretando a permissão disponível

                System.out.println(Thread.currentThread().getName() + " acessou o recurso.");

                // Simulando o uso do recurso por 2 segundos
                Thread.sleep(2000);

                // Liberando o semáforo após o uso.
                System.out.println(Thread.currentThread().getName() + " liberou o recurso.");
                semaphore.release(); // Libera o recurso, incrementando a permissão disponível
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}