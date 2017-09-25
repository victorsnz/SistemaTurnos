/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurnos;

/**
 *
 * @author Usuario
 */
class Horario 
{
    private String dia;
    private String horadesde;
    private String horaHasta;

    public Horario(String dia, String horadesde, String horaHasta)
    {
        this.dia = dia;
        this.horadesde = horadesde;
        this.horaHasta = horaHasta;
    }

    public String getDia()
    {
        return this.dia;
    }

    public void setDia(String dia) 
    {
        this.dia = dia;
    }

    public String getHoradesde() 
    {
        return this.horadesde;
    }

    public void setHoradesde(String horadesde)
    {
        this.horadesde = horadesde;
    }

    public String getHoraHasta() 
    {
        return this.horaHasta;
    }

    public void setHoraHasta(String horaHasta) 
    {
        this.horaHasta = horaHasta;
    }
    
    public String mostrar ()
    {
        return "Día: " + this.getDia() + "\n"
                + "Horario: de " + this.getHoradesde() + "hs "
                + "hasta " + this.getHoraHasta() + "hs";
    }
}
