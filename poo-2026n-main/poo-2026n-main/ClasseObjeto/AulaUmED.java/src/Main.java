public class BuscaSequencial {

    public static int buscaSequencial(String [] vetor, String valorBusca){
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i].equals(valorBusca)){
                return i;
            }
        }
        return -1;
    }

   public static void main(String[] args) {
        //vetor de frutas - Vetor tem tamanho definido (neste caso, pelos dados inseridos)
        String[] frutas = {"laranja", "maca", "pera", "uva", "banana", "limao","mamao" };
        buscaSequencial(frutas, "uva");
       System.out.println("posição de 'uva' "+buscaSequencial(frutas, "uva"));
       System.out.println("posição de 'maca' "+buscaSequencial(frutas, "maca"));
       System.out.println("posição de 'melao' "+buscaSequencial(frutas, "melao"));
    }

}
