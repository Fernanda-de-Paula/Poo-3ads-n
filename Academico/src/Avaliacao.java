import java.util.ArrayList;

public class Avaliacao {
    private String nome;
    private ArrayList<Questao> questao;

    public Avaliacao() {
        this.questao = new ArrayList<>();
    }

    public Avaliacao(String nome) {
        this.nome = nome;
        this.questao = new ArrayList<>();
    }

    //COMPOSIÇÃO
    public void adicionarQuestao(int num, String texto, float peso) {
        Questao aux = new Questao(num, texto, peso);
        this.questao.add(aux);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Questao> getQuestao() {
        return questao;
    }

    public void setQuestao(ArrayList<Questao> questao) {
        this.questao = questao;
    }

    @Override
    public String toString() {
        return "Avaliacao{" +
                "nome='" + nome + '\'' +
                ", questao=" + questao +
                '}';
    }
}
