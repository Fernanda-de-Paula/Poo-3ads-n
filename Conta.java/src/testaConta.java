public class testaConta{
    public static void main(String args[]){
        // cria um objeto (instância da classe Carro)
        Conta obj1 = new Conta();
        obj1.numeroConta = 1234;
        obj1.agencia = "Palio";
        obj1.nomeCliente = "E2D31F0";
        obj1.saldo = false;
        obj1.status = 0;
        System.out.println(obj1.toString());
        obj1.depositar();
        System.out.println(obj1.toString());
        obj1.sacar();
        System.out.println(obj1.toString());
        obj1.encerrarConta();
        System.out.println(obj1.toString());
        obj1.toString();
        System.out.println(obj1.toString());


    }
}