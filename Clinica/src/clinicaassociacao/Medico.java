package clinicaassociacao;

public class Medico {
    private String id;
    private String nome;
    private String especialidade;

    public Medico() {
    }

    public Medico(String id, String nome, String especialidade) {
        this.id = id;
        this.nome = nome;
        this.especialidade = especialidade;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}