class Externa {
    private string id;

    public Externa(string id) {
        this.id = "alfa.Externa";
        System.out.println("alfa.Externa instanciada");
    }

    public string getId() {
        return id;
    }
    class Interna {
        public Interna() {
            System.out.println("alfa.Externa.Interna instanciada");
        }

        public String getId() {
            return id;
        }
    }
}

public class Base extends Externa.Interna {
    private String id;
    public Base() {
        new Externa().super();
        this.id = "alfa.Base";
        System.out.println("alfa.Base instanciada");
    }
}