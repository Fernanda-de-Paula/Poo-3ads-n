public class Streaming {
    public String usuario;
    public String plano;
    public float mensalidade;
    public boolean ativo;
    public String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;
        this.ativo = true;
        this.ultimoFilmeAssistido = "";

        // Define a mensalidade com base no plano [cite: 42]
        if (plano.equalsIgnoreCase("Básico")) this.mensalidade = 25.90f;
        else if (plano.equalsIgnoreCase("Premium")) this.mensalidade = 45.90f;
        else if (plano.equalsIgnoreCase("Família")) this.mensalidade = 60.90f;
    }

    public void assistirFilme(String nomeFilme) {
        if (this.ativo) { // se estiver ativa, atualiza
            this.ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. Favor pagar a fatura.");
        }
    }

    public void cancelarAssinatura() {
        this.ativo = false; // alteraa o status
    }

    @Override
    public String toString() {
        String statusTexto = this.ativo ? "Ativo" : "Suspenso"; //se? primeiro verdadeiro: segundo falso
        return "Perfil: " + usuario + " | Plano: " + plano + " | Status: " + statusTexto + " | Valor: R$" + mensalidade;
    }
}
