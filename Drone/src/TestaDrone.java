public class TestaDrone {
    public static void main(String[] args) {
        Drone drone = new Drone("dji001", 0,100,false);
        System.out.println(drone.toString());
        drone.decolar();
        drone.subir(20);
        drone.subir(38);
        drone.subir(100);
        drone.descer(118);
        drone.descer(2);
        drone.descer(58);
    }
}
