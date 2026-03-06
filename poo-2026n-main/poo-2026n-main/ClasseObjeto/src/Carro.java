public class Carro {
    // atributos / propriedades (variáveis)
    public String marca, modelo, placa;
    public boolean motor; // true (ligado) ou false (desligado)
    public float velAtual;
    // método construtor - tem o mesmo nome da classe
    public Carro(){

    }
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = false;
        this.velAtual = 0;
    }
    // ligar o carro
    public void ligar(){
        if (!this.motor){
            this.motor = true;
            System.out.println("Carro foi ligado");
        }
    }
    //acelerar o carro
    public void acelerar(){
        if (this.velAtual == 0){
            this.velAtual += 10;
            System.out.println("A nova velocidade é " + velAtual);
        }
    }


    // desligar o carro
    public void desligar(){
        if (this.motor){
            this.motor = false;
            System.out.println("Carro foi desligado");
        }
    }
    // operações (métodos)
    public String toString(){ // converte objeto para String
        // this representa objeto que chama o método
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Placa: " + this.placa +
                " Vel Atual: " + this.velAtual +
                " Motor: " + (this.motor ? "ligado": "desligado");
    }
}