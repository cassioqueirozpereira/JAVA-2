// Interface externa
interface Veiculo {
    void acelerar();
    // Interface interna aninhada
    interface Motor {
        void ligar();
        void desligar();
    }
}