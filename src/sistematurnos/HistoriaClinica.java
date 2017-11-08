package sistematurnos;

import java.util.GregorianCalendar;

/**
 *
 * @author Victor Sanchez
 */
class HistoriaClinica {

    private int num;
    private String descripcion;
    private GregorianCalendar fecha;
    private Medico medico;
    private Paciente paciente;

    public HistoriaClinica(int num, String descripcion, GregorianCalendar fecha,
            Medico medico, Paciente paciente) {
        this.num = num;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.medico = medico;
        this.paciente = paciente;
    }

    public int getNum() {
        return this.num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public GregorianCalendar getFecha() {
        return this.fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    private String mostrar() {
        return "Fecha: " + this.getFecha()
                + "\nPaciente: " + this.getPaciente()
                + "\nMedico: " + this.getMedico()
                + "\nDescripción: " + this.getDescripcion();
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
