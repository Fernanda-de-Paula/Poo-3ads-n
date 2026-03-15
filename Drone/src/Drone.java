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
            setBateria(bateria - 10);
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
        if(emVoo && bateria >20){
            float y = this.altura +x;
            System.out.println("Altura pretendida: " +  y + " m");
            System.out.println("Subir em Voo " + x + " metros");
            setAltura(y);
        } else {
            System.out.println("Drone precisa estar em voo para subir");
            }

    }
    public void descer(float x){
        if(emVoo){
            float y = this.altura -x;
            System.out.println("Altura pretendida: " +  y + " m");
            System.out.println("Descer em Voo " + x + " metros");
            if(y >=0 ) {
                setAltura(y);
                if (this.altura == 0) setEmVoo(false);
                System.out.println("Drone pousado, mostores desligados");
            }
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