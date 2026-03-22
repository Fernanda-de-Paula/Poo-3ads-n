public class TestaEdificio {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Torre Univitelina", "Rua dos Bobos, nº 0");
        System.out.println(edificio.toString());

        edificio.construirApartamento("66","6");
        edificio.construirApartamento("67","6");
        edificio.construirApartamento("101","1");

        System.out.println(edificio.toString());

        edificio = null;

        System.out.println(edificio);

    }
}
