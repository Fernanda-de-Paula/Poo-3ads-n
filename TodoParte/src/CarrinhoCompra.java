import java.util.ArrayList;
import java.util.Date;

//objeto 'todo'
public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;//cliente dentro do carrinho
    private ArrayList<ItemCarrinho> itensCarrinho;


    public CarrinhoCompra() {
        this.itensCarrinho = new ArrayList<>(); //CRIA ESPAÇO NA MEMORIA PARA RECEBER OS ITENS DO CARRINHO
    }
    //1.gerar metodo construtor
    //caracteriza uma agregação
    //motivo: cliente já veio criado, não foi o carrinho que criou
    //cliente é independente
    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensCarrinho = new ArrayList<>(); //CRIA ESPAÇO NA MEMORIA PARA RECEBER OS ITENS DO CARRINHO
    }

    //ADICIONA ITENS NO CARRINHO
    //COMPOSIÇÃO - ITEM DE CARRINHO DEPENDE DO CARRINHO PARA SER CRIADO
    public void addCarrinho(int id, float qtd, Produto produto) {
        ItemCarrinho aux = new ItemCarrinho(id, qtd, produto);
        this.itensCarrinho.add(aux);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //SET CLIENTE caracteriza uma agregação
    //motivo: cliente já veio criado, não foi o carrinho que criou
    //cliente é independente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void totalCompra(){
        float total = 0;
        for (ItemCarrinho aux : this.itensCarrinho) {
            total += aux.getQtd() * aux.getProduto().getPreco();
            System.out.println("Valor Total da compra: R$ " + total);
        }
    }
    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                " , itensCarrinho=\n" + itensCarrinho + //VAI FAZER O FOR AUTOMATICAMENTE :)
                '}';
    }
}
