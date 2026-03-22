package classeassociacao;

import java.time.LocalDateTime;

public class TestaR {
    public static void main(String[] args) {
        Passageiro p1 = new Passageiro("123", "Fer");
        Passageiro p2 = new Passageiro("234", "Kiara");
        Passageiro p3 = new Passageiro("345", "Diana");

        LocalDateTime data = LocalDateTime.of(2026, 7, 15, 13, 10);
        LocalDateTime data2 = LocalDateTime.of(2026, 7, 30, 8, 0);
        Voo v1 = new Voo(1, "GRU", "SCL", data);
        Voo v2 = new Voo(2, "SCL", "GRU", data2);

        Reserva r1 = new Reserva(111, LocalDateTime.now(), 2, p1, v1);
        Reserva r2 = new Reserva(112, LocalDateTime.now(), 1, p2, v1);
        Reserva r3 = new Reserva(113, LocalDateTime.now(), 3, p3, v1);
        System.out.println(" ");
        System.out.println(r1.toString()+"\n"+ r2.toString()+"\n"+r3.toString());

        Reserva r4 = new Reserva(121, LocalDateTime.now(), 2, p1, v2);
        Reserva r5 = new Reserva(122, LocalDateTime.now(), 1, p2, v2);
        Reserva r6 = new Reserva(133, LocalDateTime.now(), 3, p3, v2);
        System.out.println(" ");
        System.out.println(r4.toString()+"\n"+ r5.toString()+"\n"+r6.toString());
    }
}