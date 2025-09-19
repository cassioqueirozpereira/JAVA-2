class AcaoExibir implements Acao {
    private String mensagem;

    public AcaoExibir(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void executar() {
        Main.output.append(mensagem + "\n");
    }
}