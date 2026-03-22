package clinicaassociacao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private float valor;
    private Paciente paciente;
    private Medico medico;



    public Consulta(LocalDateTime data, float valor, Paciente paciente, Medico medico) {
        this.data = data;
        this.valor = valor;
        this.paciente = paciente;
        this.medico = medico;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        DateTimeFormatter br = DateTimeFormatter.ofPattern("dd/MM/yyyy  HH:mm:ss");
        return "Consulta\n" +
                "data=" + data.format(br) +
                ", valor=" + valor +
                ", paciente=\n" + paciente +
                ", medico=\n" + medico +
                " ";
    }
}
