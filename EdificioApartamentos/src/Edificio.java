import java.util.ArrayList;

public class Edificio {
    private String nome;
    private String endereco;
    private ArrayList <Apartamento> apartamentos;

    public Edificio() {
        this.apartamentos = new ArrayList<>();
    }

    public Edificio(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.apartamentos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private ArrayList<Apartamento> getApartamento() {
        return apartamentos;
    }

    public void setApartamento(ArrayList<Apartamento> apartamento) {
        this.apartamentos = apartamento;
    }

    public void construirApartamento(String num, String andar) {
        Apartamento ap1 = new Apartamento(num, andar);
        this.apartamentos.add(ap1);

    }

    @Override
    public String toString() {
        String texto = "Edificio" +
                "\n nome = " + nome +
                "\n endereco='" + endereco+"\n";
        for (Apartamento ap : apartamentos){
            texto += (ap.toString())+ "\n";
        }
        return texto;
    }
}
