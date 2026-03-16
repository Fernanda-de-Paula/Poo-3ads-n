import java.util.ArrayList;

public class TestaAcademico {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("01","Fernanda","123","ADS");
        Aluno a2 = new Aluno("02","Fulano","234","ADS");

        Disciplina disciplina = new Disciplina();
        disciplina.setNome("POO");
        disciplina.setProfessor("Prof. Daniel");

        disciplina.matricularAluno(a1);
        disciplina.matricularAluno(a2);

        disciplina.criarAvaliacao("P1");
        disciplina.criarAvaliacao("P2");

        disciplina.getAvaliacao().get(0).adicionarQuestao(1, "O que é POO?", 2.5f);
        disciplina.getAvaliacao().get(0).adicionarQuestao(2, "O que é Encapsulamento?", 2.5f);
        disciplina.getAvaliacao().get(0).adicionarQuestao(3, "Explique Composição.", 5.0f);

        System.out.println(disciplina.toString());
    }
}
