class CarroEletrico extends Veiculo {
    private int autBateria;

    public CarroEletrico(String marca, String modelo, float velocidade, int autBateria) {
        super(marca, modelo, velocidade);
        this.autBateria = autBateria;
    }

    public int getAutBateria() {
        return autBateria;
    }

    public void setAutBateria(int autBateria) {
        this.autBateria = autBateria;
    }
    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente.");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida.");
    }
    @Override
    public String toString() {
        return "CarroEletrico{" +
                "autBateria=" + autBateria +
                '}';
    }
}
