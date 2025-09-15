// public class Base {
//     protected int var_base;

//     public Base(int var_base) {
//         this.var_base = -1;
//     }

//     protected void atualizarVarBase(int valor) {
//         this.var_base = valor;
//     }

//     protected void imprimirVarBase() {
//         System.out.println("O valor de var_base é " + this.var_base);
//     }

//     protected void atualizarVarSub(int valor) {
//         ((Derivada)this).var_der = valor;
//     }

//     protected void imprimirVarSub() {
//         System.out.println("O valor de var_der na subclasse é " + ((Derivada)this).var_der);
//     }
// }


public class Base {
    protected int var_base;

    public Base(int var_base) {
        this.var_base = -1;
    }

    protected void atualizarVarBase(int valor) {
        this.var_base = valor;
    }

    protected void imprimirVarBase() {
        Main.output.append("O valor de var_base é " + this.var_base + "\n");
    }

    protected void atualizarVarSub(int valor) {
        ((Derivada)this).var_der = valor;
    }

    protected void imprimirVarSub() {
        Main.output.append("O valor de var_der na subclasse é " + ((Derivada)this).var_der + "\n");
    }
}