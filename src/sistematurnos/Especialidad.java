
package sistematurnos;


/**
 *
 * @author Usuario
 */
public class Especialidad 
{
    private String nombre;
    private String descripcion;

    public Especialidad(String nombre, String descripcion) 
    {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }    
    
    public String mostrar ()
    {
        return "Nombre Especialidad: " + this.getNombre() 
                + "\nDescripcion: " + this.getDescripcion();
    }
}
