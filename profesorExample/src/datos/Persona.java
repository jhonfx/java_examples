/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author ricardocasanova
 */
public class Persona
{
    protected String nombre;
    protected String apellido;
    protected String CI;

    public Persona(String nombre, String apellido, String CI)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CI = CI;
    }

    public Persona()
    {
        this.nombre = "";
        this.apellido = "";
        this.CI = "";
    }

    public String getCI()
    {
        return CI;
    }

    public void setCI(String CI)
    {
        this.CI = CI;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void metodoSobreEscrito()
    {
        System.out.println("imprimir desde Persona");
    }
}
