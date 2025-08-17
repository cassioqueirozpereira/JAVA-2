public class Main {
    public static void main(String[] args) {
        // Criando instâncias de Gato e Cachorro
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();
        Animal leao = new Leao();

        gato.emitirSom(); // Saída: Miar!
        gato.dormir(); // Saída: Zzzzz...
        
        cachorro.emitirSom(); // Saída: Latir!
        cachorro.dormir(); // Saída: Zzzzz...

        leao.emitirSom(); // Saída: Rugir!
        leao.tipoDeAnimal(); // Saída: O leão é um animal selvagem.
        leao.dormir(); // Saída: Zzzzz...
    }
}