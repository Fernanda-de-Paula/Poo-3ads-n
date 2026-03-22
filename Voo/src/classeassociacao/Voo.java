package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int nrVoo;
    private String origem, destino;
    private LocalDateTime dataVoo; //dia, mes, ano, hora e minuto

    public Voo(int nrVoo, String origem, String destino, LocalDateTime dataVoo) {
        this.nrVoo = nrVoo;
        this.origem = origem;
        this.destino = destino;
        this.dataVoo = dataVoo;
    }

    public Voo() {
    }

    public int getNrVoo() {
        return nrVoo;
    }

    public void setNrVoo(int nrVoo) {
        this.nrVoo = nrVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getDataVoo() {
        return dataVoo;
    }

    public void setDataVoo(LocalDateTime dataVoo) {
        this.dataVoo = dataVoo;
    }

    @Override
    public String toString() {
        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        return "Voo{" +
                "nrVoo=" + nrVoo +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", dataVoo=" + dataVoo.format(br) +
                '}';
    }
}