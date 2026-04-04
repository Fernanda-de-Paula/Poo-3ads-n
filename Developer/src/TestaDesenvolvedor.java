public class TestaDesenvolvedor {
    public static void exibeDados(Desenvolvedor camaleao){ // POLIMÓRFICO : MUDA DE "COR"
        camaleao.codar();
        System.out.println(camaleao.toString() + "Bônus" +  camaleao.calcularBonus());
    }

    public static void main(String[] args) {
        Junior jr = new Junior("Fulano", "Java",  "Beltrano", 4000);
        exibeDados(jr);

        Pleno pl = new Pleno("Beltrano", "Java",  "8", 6000);
        exibeDados(pl);

        Senior sr = new Senior("Ciclano", "Java",  30000, 9000);
        exibeDados(sr);


    }
}