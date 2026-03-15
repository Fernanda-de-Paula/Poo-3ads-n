public class TestaStreaming {
    public static void main(String[] args) {
        Streaming p1 = new Streaming("Fernanda", "Premium");
        System.out.println(p1.toString());
        p1.assistirFilme("Extraordinario");

        p1.cancelarAssinatura();
        p1.assistirFilme("IA inteligencia artificial"); // Vai dar erro
        System.out.println(p1.toString());
    }
}