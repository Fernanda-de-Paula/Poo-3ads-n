public class TestaConta {
    public static void main(String[] args) {
        // Instancia João Silva [cite: 24]
        Conta c1 = new Conta(111, 1, "João Silva");
        c1.depositar(500.0f); // deposita 500
        c1.sacar(200.0f); // saque
        System.out.println(c1.toString());

        // Instancia Maria Souza
        Conta c2 = new Conta(222, 1, "Maria Souza");
        c2.sacar(50.0f);

        c1.encerrarConta(); // Tenta encerrar c1 com saldo
        c1.sacar(300.0f); // Saque do resto
        c1.encerrarConta(); // Encerra
        System.out.println(c1.toString());
    }
}