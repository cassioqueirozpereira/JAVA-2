class AnalistaDeDados implements CienciaDeDados {

    @Override
    public void analisarDados() {
        Main.output.append("O analista de dados está analisando os dados.\n");
    }

    @Override
    public void processarDados() {
        Main.output.append("O analista de dados está processando os dados.\n");
    }
}