public class Aula02 {
    public static void main(String[] args) {
        // instanciar o objeto 'c1' da classe 'Caneta'
        Caneta c1 = new Caneta();

        //definir os atributos do objeto instanciado
        c1.cor = "azul";
        c1.modelo = "1";
        c1.ponta = 0.5f;
        c1.carga = 0;
        c1.tampar(); //chamar o metodo()
        c1.status(); c1.rabiscar(); c1.destampar(); c1.status();
        c1.rabiscar(); c1.carregar(); c1.status();
        c1.rabiscar();

        //instanciar nova caneta
        Caneta c2 = new Caneta();
        c2.cor = "rosa";
        c2.modelo = "2";
        c2.tampada = false;
        c2.carregar(); c2.rabiscar();
    }
}