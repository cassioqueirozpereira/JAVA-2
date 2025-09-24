import java.util.concurrent.Semaphore;

public class Pong implements Runnable {
	//Atributos
	private Semaphore s1, s2;
	private Controle contador;
	//Métodos
	public Pong(Semaphore s1, Semaphore s2, Controle contador) {
		this.s1 = s1;
		this.s2 = s2;
		this.contador = contador;
	}
	@Override
	public void run() {
		try {
			System.out.println("Thread B (PONG) iniciada");
			while(true) {
				s2.acquire();
				// Verifica atomicamente se pode continuar e já decrementa o contador
				if (!contador.tick()) {
					s1.release(); // Libera o outro thread para que ele também possa terminar
					break;
				}
				System.out.println("0 <= PONG");
				s1.release();
			}
		} catch (InterruptedException e) {
			// Boa prática: restaurar o status de interrupção do thread
			Thread.currentThread().interrupt();
			e.printStackTrace();
		}
		System.out.println("Thread B (PONG) terminada");
	}
}