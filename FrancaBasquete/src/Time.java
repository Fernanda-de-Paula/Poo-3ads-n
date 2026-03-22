import java.util.ArrayList;

public class Time {
    private String id;
    private String nome;
    private String tecnico;
    private ArrayList <Atleta> atletas =  new ArrayList<>();

    public Time() {
    }

    public Time(String id, String nome, String tecnico, ArrayList<Atleta> atletas) {
        this.id = id;
        this.nome = nome;
        this.tecnico = tecnico;
        this.atletas = atletas;
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

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public void setAtletas(ArrayList<Atleta> atletas) {
        this.atletas = atletas;
    }

    //agregação = o atleta já vem pronto
    public void contratarAtleta(Atleta a) {
        this.atletas.add(a);
    }

    @Override
    public String toString() {
       String texto = "Time " +
                "\nid = '" + id + '\'' +
                "\nnome = '" + nome + '\'' +
                "\n tecnico = '" + tecnico + '\'' +
                "\n atletas\n = " + "\n";

        for (Atleta a : atletas) {
            texto += " - " + a.toString() + "\n";
        }
        return texto;

    }
}
