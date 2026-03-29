import java.util.List;
import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private List<ItemVenda> itens;

    public Venda() {
    }

    public Venda(Cliente cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemVenda> getItens() {
        return itens;
    }

    public void setItens(List<ItemVenda> itens) {
        this.itens = itens;
    }
    public void adicionarItem(String id, int qtd, Produto p) {
        ItemVenda novoItem = new ItemVenda(id, qtd, p);
        this.itens.add(novoItem);
    }

    @Override
    public String toString() {
        return "Venda{" +
                "cliente=" + cliente +
                ", itens=" + itens +
                '}';
    }
}