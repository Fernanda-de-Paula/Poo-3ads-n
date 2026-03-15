public class TestaPlacar {
    public static void main(String[] args) {
        Placar jogo = new Placar("Franca Basquete", "Visitante");

        jogo.registrarPonto("casa", 3); //
        jogo.registrarPonto("visitante", 2);
        System.out.println(jogo.toString());

        jogo.proximoQuarto();
        System.out.println("Mudança de período: " + jogo.toString());
    }
}