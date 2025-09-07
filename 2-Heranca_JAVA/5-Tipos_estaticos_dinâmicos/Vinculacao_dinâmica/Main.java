public class Main {
    private static Pessoa grupo[];
    public static void main ( String[] args ) {
        grupo = new Pessoa[3];
        grupo[0] = new Pessoa ( "João Silva" , "Brasileiro" , "Paulista" );
        grupo[1] = new Fisica ( "Maria Souza" , "Brasileira" , "Carioca" , "12345678901" );
        grupo[2] = new Juridica ( "Empresa X" , "Brasileira" , "Mineira" , "12345678000199" );
        for (int i = 0; i < grupo.length; i++) {
            System.out.println ( grupo[i].getNome() + " é do tipo " + grupo[i].retornaTipo() );
        }
    }
}