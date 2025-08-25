import java.util.Scanner;

class MyClass {
    public static void main (String args[]) {
        Scanner meuOjeto = new Scanner(System.in);
        System.out.println("Entre com o nome do usuário:");

        String nomeUsuario = meuOjeto.nextLine();
        System.out.println("Olá, " + nomeUsuario + "! Bem-vindo ao sistema.");
    }
}
