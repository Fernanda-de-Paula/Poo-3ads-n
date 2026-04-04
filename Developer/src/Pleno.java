//Classe filha (subclasse)
public class Pleno extends Desenvolvedor {
    private String projEnt;

    public Pleno() {
        super ();
    }

    public String getProjEnt() {
        return projEnt;
    }

    public void setProjEnt(String projEnt) {
        this.projEnt = projEnt;
    }
    @Override
    public void codar(){
        System.out.println("Pleno codando e fazendo code review");
    }

    @Override
    public float calcularBonus() {
        return this.salarioBase * 0.15f;
    }
    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projEnt='" + projEnt + '\'' +
                '}';
    }

    public Pleno(String nome, String linguagem, String projEnt, float salarioBase) {
        super(nome, linguagem, salarioBase);
        this.projEnt = projEnt;

    }
}