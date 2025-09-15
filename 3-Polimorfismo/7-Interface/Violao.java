class Violao implements InstrumentoMusical {
    
    @Override
    public void tocar() {
        Main.output.append("Tocando o violão.\n");
    }
}