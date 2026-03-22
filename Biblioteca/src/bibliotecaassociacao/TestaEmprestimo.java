package bibliotecaassociacao;

import java.time.LocalDateTime;

public class TestaEmprestimo {
    public static void main(String[] args) {
        Leitor leitor = new Leitor("l1", "Zeca Galhão");
        Leitor leitor2 = new Leitor("l2","Giuseppe Cadura");

        Livro livro = new Livro("b1","Reri Pote - As reliquias da vovó","Jota K. Rolando");
        Livro livro2 = new Livro("b2","Pai pobre, filho mais pobre ainda", "Beto Kids Greta");
        Livro livro3 = new Livro("b3", "50 tons de Tangamandapio ","El Jaiminho");

        LocalDateTime data = LocalDateTime.of(2026,3,10,9,0);
        LocalDateTime data2 = LocalDateTime.of(2026,3,14,15,12);
        LocalDateTime data3 = LocalDateTime.of(2026,3,18,15,12);

        Emprestimo emprestimo = new Emprestimo(data,data2, livro,leitor);
        Emprestimo emprestimo2 = new Emprestimo(data,data2, livro2,leitor);
        Emprestimo emprestimo3 = new Emprestimo(data2,data3, livro3,leitor2);
        System.out.println(emprestimo.toString());
        System.out.println(emprestimo2.toString());
        System.out.println(emprestimo3.toString());

    }
}
