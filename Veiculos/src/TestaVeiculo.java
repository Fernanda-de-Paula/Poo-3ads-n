public class TestaVeiculo {
    public static void main(String[] args) {

        Veiculo meuVeiculo;

        meuVeiculo = new Aviao("PIPER", "PA28", 100.0f, 7500.0f);
        meuVeiculo.toString();
        meuVeiculo.abastecer();
        meuVeiculo.mover();

        meuVeiculo = new CarroEletrico("Tesla", "Model S", 120.0f, 500);
        meuVeiculo.toString();
        meuVeiculo.abastecer();
        meuVeiculo.mover();
    }
}