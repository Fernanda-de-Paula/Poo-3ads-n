class Aviao extends Veiculo {
    private float altitudeMax;

    public Aviao(String marca, String modelo, float velocidade, float altitudeMax) {
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " KT e " + altitudeMax + " FT");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo AVGAS.");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "altitudeMax=" + altitudeMax +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }
}