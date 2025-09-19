// Classe que implementa a interface externa
class Carro implements Veiculo {
    @Override
    public void acelerar() {
        Main.output.append("Carro acelerando...\n");
    }

    // Classe interna que implementa a interface aninhada
    class MotorCarro implements Veiculo.Motor {
        @Override
        public void ligar() {
            Main.output.append("Motor do carro ligado.\n");
        }

        @Override
        public void desligar() {
            Main.output.append("Motor do carro desligado.\n");
        }
    }
}