/**
 * Esta classe representa um contador compartilhado e thread-safe.
 */
public class Controle {
    private int contador;

    public Controle(int valorInicial) {
        this.contador = valorInicial;
    }

    /**
     * Decrementa o contador de forma atômica se ele for maior que zero.
     * @return true se a operação pôde ser executada (contador > 0), false caso contrário.
     */
    public synchronized boolean tick() {
        if (this.contador > 0) {
            this.contador--;
            return true;
        }
        return false;
    }
}