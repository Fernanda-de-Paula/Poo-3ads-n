//Classe filha (subclasse)
public class Senior extends Desenvolvedor{
    private float verbaLider;

    public Senior () {
        super ();
    }

    public float getVerbaLider() {
        return verbaLider;
    }

    public void setVerbaLider(float verbaLider) {
        this.verbaLider = verbaLider;
    }

    @Override
    public void codar(){
        System.out.println("Senior define arquitetura e lidera pessoas");
    }

    @Override
    public float calcularBonus() {
        return this.salarioBase * 0.30f;
    }

    @Override
    public String toString() {
        return "Senior{" +
                super.toString() +

                "verbaLider=" + verbaLider +
                '}';
    }

    public Senior (String nome, String linguagem, float verbaLider, float salarioBase) {
        super(nome, linguagem, salarioBase );
        this.verbaLider = verbaLider;



    }
}