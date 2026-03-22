public class Computador {
    private String id;
    private String marca;
    private Processador cpu;

    public Computador() {
        this.cpu = new Processador("Slot vazio", " ", " 0 hz");
    }

    public Computador(String id, String marca, String marcaCpu, String modeloCpu, String freqCpu) {
        this.id = id;
        this.marca = marca;
        this.cpu = new Processador(marcaCpu, modeloCpu, freqCpu);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Processador getCpu() {
        return cpu;
    }

    private void setCpu(Processador cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Computador{" +
                "id='" + id + '\'' +
                ", marca='" + marca + '\'' +
                ", cpu=" + cpu.toString() +
                '}';
    }
}
