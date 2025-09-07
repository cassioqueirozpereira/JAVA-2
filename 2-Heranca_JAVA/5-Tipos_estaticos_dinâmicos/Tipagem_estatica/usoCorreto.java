public class usoCorreto {
    public static void main ( String[] args ) {
        var a = 0;
        a = a + 1;
        // Retorna a tipagem de a
        System.out.println (((Object)a).getClass().getSimpleName());
    }    
}
