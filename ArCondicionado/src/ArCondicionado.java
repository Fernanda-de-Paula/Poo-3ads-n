public class ArCondicionado {
    private String marca= "";
    private String modelo= "";
    private  int temperatura= 0;
    private boolean ligado = false;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        setModelo(modelo);
        setTemperatura(temperatura);
        setLigado(ligado);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if(marca.length()>=3) {
            this.marca = marca;
        }
        else {
            System.out.println("Marca invalido");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if  (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
            System.out.println("Temperatura: " + this.temperatura);
        }
        else System.out.println("Temperatura fora da faixa");
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public void ativarModoTurbo(){
        if(ligado==true){
            if(verificarCompressor()){
                System.out.println("Compressor funcionando, turbo ativado");
                setTemperatura(16);
            }
            else System.out.println("ERRO! compressor com defeito");
        }
    }
    private boolean verificarCompressor(){
        return (Math.random()*10)>2; //se maior q 2, retorna true
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
