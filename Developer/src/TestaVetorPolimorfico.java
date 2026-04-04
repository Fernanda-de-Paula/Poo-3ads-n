public class TestaVetorPolimorfico {
    public static void main(String[] args) {

        Desenvolvedor[] listaDevs = new Desenvolvedor[4];

        listaDevs[0] = new Junior("Fernanda", "Java", "Kiara", 4000.0f);
        listaDevs[1] = new Pleno("Diana", "Python", "Sistema de Vendas", 6500.0f);
        listaDevs[2] = new Senior("Kiara", "Java", 5000.0f, 12000.0f);
        listaDevs[3] = new Desenvolvedor("Marcos", "JavaScript", 5000.0f);

        System.out.println("=== RELATÓRIO DE FOLHA DE PAGAMENTO ===\n");

        for (Desenvolvedor dev : listaDevs) {
            // Polimorfismo Java decide qual codar()
            dev.codar();

            // Exibindo o bônus e os dados do
            System.out.println("Bônus calculado: R$ " + dev.calcularBonus());
            System.out.println(dev.toString());

            System.out.println("----------------------------------------");
        }
    }
}
