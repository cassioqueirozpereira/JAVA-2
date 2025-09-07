class Externa {
    private String id;
    public Externa ( ) {
        id = "pct_alfa.Externa";
        System.out.println( "pct_alfa.Externa instanciada." );
    }
    public String getId () {
       return id;
    }
    class Interna {  
        public Interna ( ) {
        id = "pct_alfa.Externa.Interna";
        System.out.println( "pct_alfa.Externa.Interna instanciada." );
        }
        public String getId () {
            return id;
        }
    }
}
public class Base extends Externa.Interna {
    private String id;
    public Base ( ) {
        new Externa().super();
        id="pct_alfa.Base";
        System.out.println( "pct_alfa.Base instanciada." );
    }
}