public class TestaMercado {
    public static void main(String[] args) {

        Produto p1 = new Produto("1", "Arroz 5kg", 25.50f);
        Produto p2 = new Produto("2", "Feijão 1kg", 8.90f);
        Cliente c1 = new Cliente();
        c1.setNome("José da Silva");

        Venda venda = new Venda(c1);

        venda.adicionarItem("IT01", 2, p1);
        venda.adicionarItem("IT02", 3, p2);
        System.out.println(venda.toString());

    }
}