public class Padrao {
    public static void main(String[] args) {
        Padrao obj = new Padrao();
        System.out.println(obj.toString());
    }
    @Override
    public String toString() {
        return getClass().getName() + "@" + Integer.toHexString( hashCode() );
    }
}