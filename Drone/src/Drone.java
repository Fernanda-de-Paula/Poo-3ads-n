public class Drone {
    private  String codigo;
    private float altura;
    private int bateria;
    private boolean emVoo;

    public Drone() {
    }

    public Drone(String codigo, float altura, int bateria, boolean emVoo) {
        setCodigo(codigo);
        setAltura(altura);
        setBateria(bateria);
        setEmVoo(emVoo);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura >= 0 && altura <= 120) {
            this.altura = altura;
            System.out.println("Altura setada: " +altura + " m");
        } else {
            System.out.println("Altura inválida, não pode ser negativa ou maior que 120 metros");
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        if(bateria >= 0 && bateria <= 100) {
        this.bateria = bateria;
            System.out.println("Carga da bateria: " + bateria + "%");
        }
    }

    public boolean isEmVoo() {
        return emVoo;
    }

    public void setEmVoo(boolean emVoo) {
        this.emVoo = emVoo;
    }

    public void decolar(){
        if(bateria>20){
            if(testarMotores()){
            setEmVoo(true);
            System.out.println("Tudo pronto! Decolar");
            setAltura(2);
            } else {
                System.out.println("Decolagem recusada, avaria detectada");
                setEmVoo(false);
                setAltura(0);
            }
        } else {
            System.out.println("Carga da bateria insuficiente" + bateria + "%");
        }
    }
    private boolean testarMotores() {
        System.out.println("Testando motores... \n Avaliando hélices...");
        System.out.println("Calibrando GPS");
        return (Math.random()*10)<8;
    }
    public void subir(float x){
        if(emVoo){
            if((altura +=x) <= 120){
                System.out.println("Altura pretendida: " +  (altura+x) + " m");
                System.out.println("Subir em Voo " + x + " metros");
                setAltura(altura += x);
            } else {
                System.out.println("Altura pretendida: " +  (altura+x) + " m");
                System.out.println("ERRO! Não é permitido subir acima de 120 metros");
                setAltura(120);
                System.out.println("Altura do Drone definida para : " + altura + "m");
            }
        }
    }
    public void descer(float x){
        if(emVoo){
            System.out.println("Descer " + x + " metros");
            setAltura(altura -= x);
        }
    }

    @Override
    public String toString() {
        return "Drone{" +
                "codigo='" + codigo + '\'' +
                ", altura=" + altura +
                ", bateria=" + bateria +
                ", emVoo=" + emVoo +
                '}';
    }
}