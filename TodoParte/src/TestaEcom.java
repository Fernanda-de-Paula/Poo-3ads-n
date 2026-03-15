import java.util.Date;

public class TestaEcom {

    public static void main(String[] args) {
        // Instancia cliente
        Cliente c1 = new Cliente("123456", "Kiara", "Rua A");
        CarrinhoCompra compra = new CarrinhoCompra(1, new Date(),c1);
        System.out.println(compra.toString());

        Produto p1 = new Produto(1,"Ração", "Special filhotes", 130);
        compra.addCarrinho(1,3,p1);
        Produto p2 = new Produto(2, "Brinquedo", "Bolinha", 15);
        compra.addCarrinho(2,2,p2);

        System.out.println(compra.toString());
        compra.totalCompra();
    }
}