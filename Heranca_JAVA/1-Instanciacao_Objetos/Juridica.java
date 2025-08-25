public class Juridica extends Pessoa {
    //Atributos
    private String CNPJ;
    
    //Métodos
    public Juridica ( String nome , String nacionalidade , String naturalidade , String CNPJ ) {
        super ( nome , nacionalidade , naturalidade );
        this.setCNPJ(CNPJ);
    }  
    
    protected void setCNPJ ( String CNPJ ) {
        if (validaCNPJ (CNPJ))
            this.CNPJ = CNPJ;
        else
            System.out.println("CNPJ inválido!");
    }
    
    protected String getCNPJ ( ) {
        return this.CNPJ;
    }

    private boolean validaCNPJ ( String CNPJ ) {
        // Lógica simplificada para validação de CNPJ
        return CNPJ != null && CNPJ.matches("\\d{14}");
    }
}