public class Conta{
    // atributos / propriedades (variáveis)
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status; //true = ativa ou false = encerrada

    public Conta (){

    }
    public Conta (int numeroConta, int agencia, String nomeCliente, float saldo, boolean status) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    // depositar apenas se conta ativa
    public void depositar(float valor){
        if (this.status){ // conta está ativa
            this.saldo += valor;
            System.out.println("Deposito de " + saldo + " realizado");
        }

        // sacar apenas se conta ativa e valor >= saldo
        public void sacar(float valor){
            if (!this.status){ // conta está ativa
                if()
                this.saldo -= valor;
                System.out.println("Deposito de " + saldo + " realizado");
            }



}