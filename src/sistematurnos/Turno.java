
package sistematurnos;

import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Turno 
{
    private Paciente paciente;
    private GregorianCalendar FechaYhora;
    private Medico medico;
    private String estado;
    private boolean urgente;
    private String Especialidad;

    public Turno(Paciente paciente, GregorianCalendar FechaYhora, Medico medico,
                        String estado, boolean urgente, String Especialidad) 
    {
        this.paciente = paciente;
        this.FechaYhora = FechaYhora;
        this.medico = medico;
        this.estado = estado;
        this.urgente = urgente;
        this.Especialidad = Especialidad;
    }

    public Paciente getPaciente() {
        return this.paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public GregorianCalendar getFechaYhora() {
        return this.FechaYhora;
    }

    public void setFechaYhora(GregorianCalendar FechaYhora) {
        this.FechaYhora = FechaYhora;
    }

    public Medico getMedico() {
        return this.medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isUrgente() {
        return this.urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public String getEspecialidad() {
        return this.Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    public boolean cambiarEstado(String estado)
    {
        this.setEstado(estado);
        return (this.getEstado().equals("Atendido"));
    }
    
    public boolean cambiarFecha(GregorianCalendar fecha)
    {
        GregorianCalendar fechaAnterior;
        fechaAnterior = this.getFechaYhora();
        this.setFechaYhora(fecha);
        return (this.getFechaYhora().equals(fecha));
    }

    private void setFecha(GregorianCalendar fecha) {
        
    }
}