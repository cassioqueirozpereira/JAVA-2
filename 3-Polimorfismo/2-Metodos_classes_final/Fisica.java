// Classe final Fisica, ou seja, ela não pode ser extendida, ou também, ela não pode ser herdada (ter filhos)
final class Fisica extends Pessoa {
    public Fisica(int identificador) {
        super(identificador);
    }

    @Override
    public void atualizarID() {
        identificador += 1;
    }
}