class CientistaDeDados implements CienciaDeDados {

    @Override
    public void analisarDados() {
        Main.output.append("O cientista de dados está analisando os dados.\n");
    }

    @Override
    public void processarDados() {
        Main.output.append("O cientista de dados está processando os dados.\n");
    }
}