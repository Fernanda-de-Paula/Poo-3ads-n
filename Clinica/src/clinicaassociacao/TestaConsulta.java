package clinicaassociacao;

import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main(String[] args) {
        Paciente p1 = new Paciente("p01","Fulano","1234");
        Paciente p2 = new Paciente("p02","Beltrano","2345");

        Medico m1 = new Medico("dr1","Dr. Hanz Chucrutes","Neurocirugiao");
        Medico m2 = new Medico("dr2", "Dr. Frankstein", "Ortopedia");

        LocalDateTime dt1 = LocalDateTime.of(2026,5,20,14,30);
        LocalDateTime dt2 = LocalDateTime.of(2026,5,20,8,30);
        Consulta cirurgia_Cerebral = new Consulta(dt1,65000,p1,m1);
        System.out.println(cirurgia_Cerebral.toString());
        System.out.println(" ");

        Consulta reconstrucao_perna_dir = new Consulta(dt2,32500,p2,m2);
        System.out.println(reconstrucao_perna_dir.toString());
    }
}