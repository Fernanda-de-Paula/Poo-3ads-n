import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String id;
    private LocalDateTime horario;
    private int sala;
    private Filme filme;
    private List<Ingresso> ingressos;


    public Sessao() {
    }

    public Sessao(String id, LocalDateTime horario, int sala) {
        this.id = id;
        this.horario = horario;
        this.sala = sala;
        this.ingressos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public void vincularFilme(Filme f) {
        this.filme = f;
    }

    public void venderIngresso(int id, String assento, String tipo, float preco) {
        Ingresso novoIngresso = new Ingresso(id, assento, tipo, preco);
        this.ingressos.add(novoIngresso);
    }

    @Override
    public String toString() {
        return "Sessao{" +
                "id='" + id + '\'' +
                ", horario=" + horario +
                ", sala=" + sala +
                ", filme=" + filme +
                ", ingressos=" + ingressos +
                '}';
    }
}