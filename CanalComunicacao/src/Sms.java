public class Sms extends CanalNotificacao{
    private int nTelefone;

    public Sms(int nTelefone) {
        this.nTelefone = nTelefone;
    }

    public Sms(String destinatario, String mensagem, int nTelefone) {
        super(destinatario, mensagem);
        this.nTelefone = nTelefone;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número:"+ this.nTelefone + " Mensagem: " + this.mensagem);
    }

    @Override
    public String toString() {
        return "Sms{" +
                super.toString() +
                "nTelefone=" + nTelefone +
                '}';
    }
}
