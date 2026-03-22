package bibliotecaassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Emprestimo {
    private LocalDateTime dataEmprestimo;
    private LocalDateTime dataDevolucaoPrevista;
    private Livro livro;
    private Leitor leitor;

    public Emprestimo() {
    }

    public Emprestimo(LocalDateTime dataEmprestimo, LocalDateTime dataDevolucaoPrevista, Livro livro, Leitor leitor) {
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.livro = livro;
        this.leitor = leitor;
    }

    public LocalDateTime getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDateTime dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDateTime getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public void setDataDevolucaoPrevista(LocalDateTime dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Leitor getLeitor() {
        return leitor;
    }

    public void setLeitor(Leitor leitor) {
        this.leitor = leitor;
    }

    @Override
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return "Emprestimo\n" +
                "dataEmprestimo = " + dataEmprestimo.format(dtf) + "\n" +
                "\n dataDevolucaoPrevista = " + dataDevolucaoPrevista.format(dtf) +
                "\n livro = " + livro.getTitulo() + " | Autor = "+ livro.getAutor() +
                "\n leitor = " + leitor.getNome();
    }
}