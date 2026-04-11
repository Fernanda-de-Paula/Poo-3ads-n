public class Email extends CanalNotificacao{ //NÃO ESQUECER DO EXTENDS
    private String assunto;

    public Email() {
        super();
    }

    public Email(String assunto, String mensagem, String destinatario) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando email para "+ this.destinatario + "com o assunto : "+ this.assunto + "Mensagem" + this.mensagem); //NÃO ESQUECER DO THIS.
    }
    @Override
    public String toString() {
        return "Email{" +
                super.toString() + //NÃO ESQUECER DA SUPER NO TO STRING
                "assunto='" + assunto + '\'' +
                '}';
    }
}
