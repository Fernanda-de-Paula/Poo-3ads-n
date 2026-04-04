//Classe filha (subclasse)
public class Junior extends Desenvolvedor {
    private String mentor;

    public  Junior() {
        super ();
    }

    public String getMentor() {
        return mentor;
    }

    public void setMentor(String mentor) {
        this.mentor = mentor;
    }


    @Override
    public String toString() {
        return "Junior{" +
                super.toString() +
                "mentor='" + mentor + '\'' +
                '}';
    }

    public Junior(String nome, String linguagem, String mentor, float salarioBase) {
       super(nome, linguagem, salarioBase );
       this.mentor = mentor;

    }
}