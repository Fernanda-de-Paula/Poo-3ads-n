public class TestaArCondicionado {
    public static void main(String[] args) {
        ArCondicionado ar1 = new ArCondicionado("Samsung", "inverter", 22, true);
        ArCondicionado ar2 = new ArCondicionado("LG", "dual",21, true);

        System.out.println(ar1.toString());
        System.out.println(ar2.toString());

        ar1.setTemperatura(35);
        ar1.ativarModoTurbo();
        System.out.println(ar1.toString());
        ar1.setTemperatura(20);

    }
}
