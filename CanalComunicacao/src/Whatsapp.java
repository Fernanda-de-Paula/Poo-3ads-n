public class Whatsapp extends CanalNotificacao{
    private String statusLeitura;


    public Whatsapp(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    public Whatsapp() {
        super();
    }

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando ZAP para "+ this.destinatario + "| Mensagem: " + this.mensagem);
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }
}