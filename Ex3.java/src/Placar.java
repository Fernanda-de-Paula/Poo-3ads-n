public class Placar {
    public String nomeTimeCasa;
    public String nomeTimeVisitante;
    public int pontosCasa;
    public int pontosVisitante;
    public int periodoQuarto;

    public Placar(String casa, String visitante) {
        this.nomeTimeCasa = casa;
        this.nomeTimeVisitante = visitante;
        this.pontosCasa = 0;
        this.pontosVisitante = 0;
        this.periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) { //soma quem fez mais cesta
        if (time.equalsIgnoreCase("casa")) {
            this.pontosCasa += tipo; //soma os de franca
        } else {
            this.pontosVisitante += tipo; //soma os de fora
        }
    }

    public void proximoQuarto() {
        if (this.periodoQuarto < 4) { //incrementa se não for o último
            this.periodoQuarto++;
        } else {
            System.out.println("Aviso: O jogo terminou!");
        }
    }

    @Override //sobreescreve o pad~rao pelo q eu escolher
    public String toString() { // placar atual
        return nomeTimeCasa + " [" + pontosCasa + "] x [" + pontosVisitante + "] " + nomeTimeVisitante + " - Período: " + periodoQuarto;
    }
}