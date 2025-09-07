public class Fisica extends Pessoa {
    //Atributos
    private String CPF;
    
    //Métodos
    public Fisica ( String nome , String nacionalidade , String naturalidade , String CPF ) {
        super ( nome , nacionalidade , naturalidade );
        this.setCPF(CPF);
    }  
    
    protected void setCPF ( String CPF ) {
        if (validaCPF (CPF))
            this.CPF = CPF;
        else
            System.out.println("CPF inválido!");
    }
    
    protected String getCPF ( ) {
        return this.CPF;
    }

    private boolean validaCPF ( String CPF ) {
        // Lógica simplificada para validação de CPF
        return CPF != null && CPF.matches("\\d{11}");
    }
}
