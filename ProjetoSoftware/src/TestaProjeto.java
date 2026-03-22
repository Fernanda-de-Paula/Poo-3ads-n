import java.util.ArrayList;

public class TestaProjeto {
    public static void main(String[] args) {
        Programador p1 = new Programador("p01","JULIO XOSÉ","C#");
        Programador p2 = new Programador("p02","EMINEM JOSÉ", "JAVA");
        Programador p3 = new Programador("p03","SHERONE CHARMENE", "JAVA");
        Programador p4 = new Programador("p04","CHARLINHO", "BATATA");

        Projeto pj = new Projeto("i0127","PROJETO RAM.MATAN", new ArrayList<>());

        pj.adicionaProgs(p1);
        pj.adicionaProgs(p2);
        pj.adicionaProgs(p3);
        pj.adicionaProgs(p4);

        System.out.println(pj.toString());


    }

}
