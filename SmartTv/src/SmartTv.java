public class SmartTv {
    private String marca, modelo;
    private int volume;
    private boolean internet;

    public SmartTv();

    public SmartTv(String marca, String modelo, int volume, boolean internet){
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setVolume(volume);
        this.internet = internet;
    }
    public void setVolume(){
        if (volume >= 0 && <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    public int getVolume(){
        return this.volume;
    }
    public void setMarca(String marca){
        //metodo lenght é de instância
        if (marca.lenght() <= 30){
            this.marca = marca;
        }
        else System.out.println("Marca inválida");
    }
    public String getMarca(){
        return this.marca;
    }
    public void setModelo(String modelo){
        char letraInicial = modelo.charAt(0);
        boolean resp = Character.isUpperCase(letraInicial);
        if (resp = true){
            this.modelo = modelo;
        }
        else System.out.println("Modelo Inválido");
    }

    public String getModelo(){
        return this.modelo;
    }
    public void aumentaVolume(int x){
        this.setVolume(this.volume + x);
    }
    public void diminuiVolume(int x){
        this.setVolume(this.volume - x);
    }
    public void abrirYouTube(){
        //se conectado na internet
    }
    private boolean conectaInternet(){
        System.out.println("Verificando conexões");
        System.out.println("Consultando as credenciais");
        int randomico = (int)(Math.random() * 10); //math.random gera de 0.00 a 0.99 e (int) converte para inteiro
        if (randomico <5 ){
            System.out.println("IP gerado com sucesso");
            return true;
        }
        else {
            System.out.println("falha na conexão");
            return false;
        }
    }
}