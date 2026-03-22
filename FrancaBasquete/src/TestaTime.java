import java.util.ArrayList;

public class TestaTime {
    public static void main(String[] args) {
        Atleta a1 = new Atleta("14","GEORGINHO","ARMADOR");
        Atleta a2 = new Atleta("10","NACHO","ARMADOR");
        Atleta a3 = new Atleta("7","NICOLINI","ARMADOR");
        Atleta a4 = new Atleta("3","BENNET","ALA/ARMADOR");
        Atleta a5 = new Atleta("58","ZU JR","ALA/ARMADOR");
        Atleta a6 = new Atleta("34","VINI SANTOS","ALA/ARMADOR");
        Atleta a7 = new Atleta("32","DAVID JACKSON","ALA");
        Atleta a8 = new Atleta("15","RODRIGUEZ","ALA");
        Atleta a9 = new Atleta("13","PIÁ","ALA");
        Atleta a10 = new Atleta("26","PEPÊ","ALA");
        Atleta a11 = new Atleta("9","LUCAS DIAS","ALA/PIVÔ");
        Atleta a12 = new Atleta("12","MINEIRO","ALA/PIVÔ");
        Atleta a13 = new Atleta("6","FELÍCIO","PIVÔ");
        Atleta a14 = new Atleta("16","VITOR HUGO","PIVÔ");

        Time franca = new Time("FRCB","SESI Franca","HELINHO GARCIA", new ArrayList<>());

        franca.contratarAtleta(a1);
        franca.contratarAtleta(a2);
        franca.contratarAtleta(a3);
        franca.contratarAtleta(a4);
        franca.contratarAtleta(a5);
        franca.contratarAtleta(a6);
        franca.contratarAtleta(a7);
        franca.contratarAtleta(a8);
        franca.contratarAtleta(a9);
        franca.contratarAtleta(a10);
        franca.contratarAtleta(a11);
        franca.contratarAtleta(a12);
        franca.contratarAtleta(a13);
        franca.contratarAtleta(a14);
        System.out.println(franca.toString());

        franca = null;

        System.out.println(franca);
        System.out.println(a1.toString());
    }
}
