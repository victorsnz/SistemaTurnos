/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurnos;

import java.util.ArrayList;

/**
 *
 * @author Victor Sanchez
 */
class Medico
{
    private String nombre;
    private String apellido;
    private int DNI;
    private int MN;
    private int MPE;
    private ArrayList<Especialidad> especialidades;
    private boolean estado;
    private ArrayList<Horario> horario;

    public Medico(String nombre, String apellido, int DNI, int MN,
                  int MPE, ArrayList<Especialidad> especialidades,
                  boolean estado, ArrayList<Horario> horario)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.MN = MN;
        this.MPE = MPE;
        this.especialidades = especialidades;
        this.estado = estado;
        this.horario = horario;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return this.apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getDNI()
    {
        return this.DNI;
    }

    public void setDNI(int DNI)
    {
        this.DNI = DNI;
    }

    public int getMN()
    {
        return this.MN;
    }

    public void setMN(int MN)
    {
        this.MN = MN;
    }

    public int getMPE()
    {
        return this.MPE;
    }

    public void setMPE(int MPE)
    {
        this.MPE = MPE;
    }

    public ArrayList<Especialidad> getEspecialidades()
    {
        return this.especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades)
    {
        this.especialidades = especialidades;
    }

    public boolean isEstado()
    {
        return this.estado;
    }

    public void setEstado(boolean estado)
    {
        this.estado = estado;
    }

    public ArrayList<Horario> getHorario()
    {
        return this.horario;
    }

    public void setHorario(ArrayList<Horario> horario)
    {
        this.horario = horario;
    }


    public String mostrar ()
    {
        return "Nombre: " + this.getNombre()
                + "\nDNI: " + this.getDNI()
                + "\nM.N.: " + this.getMN()
                + "\nM.P.: " + this.getMPE()
                + "\nEstado: " + this.isEstado()
                + "\nHorario: " + this.getHorario();
    }
}
