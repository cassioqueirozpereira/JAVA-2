import java.util.Random;
    //Classe
    public class Pessoa {    
    //Atributos
    private String nome;
    private double codigo_identificador;
    private Random aleatorio;   
    
    //Construtor
    public Pessoa (String nome){
         aleatorio = new Random();
        // Forma mais robusta de atribuir valores. Pois garante que a lógica de validação
        // seja aplicada antes de atribuir o valor.
         this.setNome(nome);
         this.codigo_identificador = aleatorio.nextDouble();
    }

    //Métodos
    private void setNome (String nome) {
         this.nome = nome;
    }  
    public String getNome () {
         return nome;
    }
    public double getCodigoIdentificador (){
         return codigo_identificador;
    }

    //Método main para teste
    public static void main(String args[]){
        Pessoa p1 = new Pessoa("Teste A");
        System.out.println("Pessoa 1: "+p1.getNome());
        System.out.println("Pessoa 1: "+p1.getCodigoIdentificador());
    }
}