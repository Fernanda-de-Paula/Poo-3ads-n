public class ItemVenda {
    private String id;
    private int quantidade;
    private Produto produto;

    public ItemVenda() {
    }

    public ItemVenda(String id, int quantidade, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.produto = produto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Item: " + produto.getNome() + " | Qtd: " + quantidade + " | Subtotal: R$" + (produto.getPreco() * quantidade);
    }
}
