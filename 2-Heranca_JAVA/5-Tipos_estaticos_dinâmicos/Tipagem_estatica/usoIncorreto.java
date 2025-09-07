public class usoIncorreto {
    public static void main ( String[] args ) {
        var a = 0;
        a = "Palavra";
        // Retorna a tipagem de a
        System.out.println (((Object)a).getClass().getSimpleName());
    }
}
