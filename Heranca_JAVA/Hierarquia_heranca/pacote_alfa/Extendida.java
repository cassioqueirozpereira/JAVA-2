public class Extendida extends Externa.Interna {
    private String id;
    public Extendida() {
        new Externa().super();
        this.id = "alfa.Extendida";
        System.out.println("alfa.Extendida instanciada");
    }
}