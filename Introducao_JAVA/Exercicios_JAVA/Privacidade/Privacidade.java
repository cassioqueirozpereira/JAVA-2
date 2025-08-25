public class Privacidade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "joa@email.com");
        System.out.println(pessoa.nome);
        // Erro, pois o atributo idade da classe pessoa está privado, para corrigir teria que criar um método getIdade() na classe Pessoa ou mudar o atributo para public ou protected.
        System.out.println(pessoa.idade);
        System.out.println(pessoa.email);
    }
}