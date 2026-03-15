public class ItemCarrinho {
    private int id;
    private float qtd;
    private Produto produto;



    //ESSE CONSTRUTOR CARACTERIZA UMA AGREGAÇÃO
    //PRODUTO JÁ VEIO CRIADO, É INDEPENDENTE
    public ItemCarrinho(int id, float qtd, Produto produto) {
        this.id = id;
        this.qtd = qtd;
        this.produto = produto;
    }

    public ItemCarrinho() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtd() {
        return qtd;
    }

    public void setQtd(float qtd) {
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    //SET PRODUTO CARACTERIZA UMA AGREGAÇÃO
    //PRODUTO JÁ VEIO CRIADO, É INDEPENDENTE
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItemCarrinho{" +
                "id=" + id +
                ", qtd=" + qtd +
                ", produto=\n" + produto +
                '}';
    }
}
