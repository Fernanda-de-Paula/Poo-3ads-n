public class Conta {
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    //metodo construtor
    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }
    //metodo depositar
    public void  depositar(float valor) {
        if (this.status) {
            this.saldo += valor;
            System.out.println("depósito de R$ " + valor + " efetuado");
        }else{
            System.out.println("Erro: Conta inativa, impossível depositar");
        }
    }
    //metodo sacar
    public void sacar(float valor) {
        if (!this.status) {
            System.out.println("Erro: Conta inativa");
        } else if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Sque de R$ " + valor + " efetuado");
        } else {
            System.out.println("Erro: Saldo insuficiente");
        }
    }
    //metodo encerrar conta
    public void encerrarConta(){
        if(this.saldo > 0){
            System.out.println("Erro: Conta possui saldo. Saque R$ "+ saldo + " para prosseguir o encerramento.");
        }else{
            this.status = false;
            System.out.println("Conta encerrada");
        }
    }
    @Override
    public String toString() {
        return
    }
}
