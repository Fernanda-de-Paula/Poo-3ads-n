import java.util.ArrayList;

public class Projeto {
    private String id;
    private String nomeProjeto;
    private ArrayList <Programador> programador = new ArrayList<>();

    public Projeto() {
    }

    public Projeto(String id, String nomeProjeto, ArrayList<Programador> programador) {
        this.id = id;
        this.nomeProjeto = nomeProjeto;
        this.programador = programador;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public ArrayList<Programador> getProgramador() {
        return programador;
    }

    public void setProgramador(ArrayList<Programador> programador) {
        this.programador = programador;
    }

    public void adicionaProgs(Programador programador) {
        this.programador.add(programador);
    }

    @Override
    public String toString() {
        String texto = "Projeto \n" +
                "\nid = " + id  +
                "\n nomeProjeto = " + nomeProjeto + "\n";
        for (Programador p : programador) {
            texto += p.toString() + "\n";
        }return texto;
    }
}