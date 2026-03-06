public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println(" - Modelo: " + this.modelo);
        System.out.println(" - A caneta é "+ this.cor);
        System.out.println(" - Ponta " + this.ponta);
        System.out.println(" - Carga " + this.carga);
        System.out.println(" - Está tampada? "+ this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Caneta tampada, não posso rabiscar");
        } else if (this.carga <= 0) {
            System.out.println("ERRO! Sem tinta, não posso rabiscar");
        } else{
            System.out.println("Estou rabiscando :)");
        }
    }
    void tampar(){
        this.tampada = true;
        System.out.println("Agora está tampada");
    }
    void destampar(){
        this.tampada = false;
        System.out.println("Agora está destampada");
    }
    void carregar(){
        this.carga = 1;
        System.out.println("agora está carregada");
    }

}
