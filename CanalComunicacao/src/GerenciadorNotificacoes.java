import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public void enviarMensagem(CanalNotificacao camaleao){
        camaleao.enviar();

    }
    public static void main(String[] args) {
        ArrayList<CanalNotificacao> canais = new ArrayList();
        //adiciona as notificações no vetor
        canais.add(
            new Email("vacina","Venha tomar vacina", "Carlos"));
        canais.add(
            new Sms ("Carlos", "Venha tomar vacina",99999));
        canais.add(
            new Whatsapp("Carlos","Venha tomar vacina","Não lida"));
        for (CanalNotificacao camaleao : canais) {
            camaleao.enviar();
        }
    }
}