import java.util.UUID;

//Classe
public class Aluno extends Pessoa {

//Atributos
    protected String matricula;
    
//Métodos
    public Aluno ( String nome , String nacionalidade , String naturalidade ) {
        super ( nome , nacionalidade , naturalidade );
        this.matricula = UUID.randomUUID( ).toString( );
    }

    public void atualizarID ( ) {
        if ( this.identificador.isBlank() )
            this.identificador = UUID.randomUUID( ).toString( );
        else
            System.out.println ( "ERRO: Codigo matricula ja existente!" );
    }
}