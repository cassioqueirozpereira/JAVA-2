package Heranca_JAVA.Hierarquia_heranca.pacote_beta;
import Heranca_JAVA.Hierarquia_heranca.pacote_alfa.*;
class Execucao {
    private String id;
    public Execucao () {
        id="PctAlfa.Execucao";
        System.out.println( "PctAlfa.Execucao instanciada." );
    }
}
public class Principal {
    static Execucao ex;
    static Base bs;
    public static void main(String[] args) {
        ex = new Execucao ();
        bs = new Base ();
        System.out.println ( bs.getId() );
    }
}