class Endereco {
    //Atributos
    private String nome_rua;
    private int numero;

    //Construtor
    public Endereco ( String nome_rua , int numero) {
        this.setNomeRua (nome_rua);
        this.setNumero (numero);
    }

    //Métodos
    public void setNomeRua ( String nome_rua ) {
        this.nome_rua = nome_rua;
    }

    public void setNumero ( int numero ) {
        this.numero = numero;
    }

    public String getNomeRua () {
        return nome_rua;
    }

    public int getNumero () {
        return numero;
    }

    // Método main para teste
    // public static void main(String args[]){
    //     Endereco ender = new Endereco ("rua X", 7);
    //     System.out.println(ender.getNomeRua()+", "+ender.getNumero());
    // }
}
