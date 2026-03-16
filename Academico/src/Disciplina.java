import java.util.ArrayList;

public class Disciplina {
    private String id;
    private String nome;
    private String professor;
    private ArrayList<Aluno> aluno = new ArrayList<>();
    private ArrayList<Avaliacao> avaliacao = new ArrayList<>();

    public Disciplina() {
    }

    public Disciplina(String id, String nome, String professor, ArrayList<Aluno> aluno, ArrayList<Avaliacao> avaliacao) {
        this.id = id;
        this.nome = nome;
        this.professor = professor;
        this.aluno = aluno;
        this.avaliacao = avaliacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public ArrayList<Avaliacao> getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(ArrayList<Avaliacao> avaliacao) {
        this.avaliacao = avaliacao;
    }
    public void matricularAluno(Aluno a){
        this.aluno.add(a);
    }
    public void criarAvaliacao(String nome){
        Avaliacao aux = new Avaliacao();
        aux.setNome(nome);
        this.avaliacao.add(aux);
    }

    @Override
    public String toString() {
        return "Disciplina{\n" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", professor='" + professor + '\'' +
                ", aluno=" + aluno +
                ", avaliacao=" + avaliacao +
                '}';
    }
}
