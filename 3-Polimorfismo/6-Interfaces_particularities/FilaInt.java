import java.util.LinkedList;
import java.util.Queue;

class FilaInt implements EstruturaDeDados {
    private Queue<Integer> fila = new LinkedList<>();

    @Override
    public void adicionar(int valor) {
        fila.offer(valor);
    }

    @Override
    public void remover() {
        if (!fila.isEmpty()) {
            fila.poll();
        }
        else {
            Main.output.append("A fila está vazia.\n");
        }
    }

    @Override
    public void exibir() {
        Main.output.append("\nConteúdo da fila: " + fila);
    }
}