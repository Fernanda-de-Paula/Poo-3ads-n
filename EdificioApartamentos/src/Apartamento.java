public class Apartamento {
    private String numero;
    private String andar;

    public Apartamento() {
    }

    public Apartamento(String numero, String andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "numero='" + numero + '\'' +
                ", andar='" + andar + '\'' +
                '}';
    }
}
