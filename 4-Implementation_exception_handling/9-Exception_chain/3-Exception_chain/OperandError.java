public class OperandError extends NullPointerException { 
    OperandError ( String msg_erro ) { 
        super ( msg_erro ); 
    }     
    OperandError ( Throwable causa ) { 
        initCause ( causa ); 
    }         
    @Override 
    public String toString ( ) { 
        return "Operando nulo: " + this.getMessage(); 
    } 
}