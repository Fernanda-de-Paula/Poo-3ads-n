import java.time.LocalDateTime;

public class TestaCinema {
    public static void main(String[] args) {
        Filme f1 = new Filme("F01", "batman", "heroi", 150);
        Filme f2 = new Filme("F02", "duna", "suspense", 148);

        LocalDateTime dataSessao = LocalDateTime.of(2026, 7, 20, 20, 0);
        Sessao sessao = new Sessao("S101", dataSessao, 1);
        Sessao sessao2 = new Sessao("S102", dataSessao, 2);

        // Agregação
        sessao.vincularFilme(f1);
        sessao2.vincularFilme(f2);

        // Composição
        sessao.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao.venderIngresso(2, "A2", "Meia", 15.0f);
        sessao.venderIngresso(3, "A3", "Inteira", 30.0f);

        sessao2.venderIngresso(1, "A1", "Inteira", 30.0f);
        sessao2.venderIngresso(2, "A2", "Inteira", 30.0f);
        sessao2.venderIngresso(3, "A3", "Inteira", 30.0f);
        System.out.println(sessao.toString());
    }
}