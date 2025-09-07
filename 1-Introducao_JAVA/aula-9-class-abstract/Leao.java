public class Leao extends Animal {
    // Implementação do método abstrato
    @Override
    public void emitirSom() {
        System.out.println("Rugir!");
    }
    
    @Override
    public void tipoDeAnimal() {
        System.out.println("O leão é um animal selvagem.");
    }
}