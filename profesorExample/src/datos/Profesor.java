/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

/**
 *
 * @author ricardocasanova
 */
public class Profesor extends Persona
{
    private String cargo;

    public Profesor(String nombre, String apellido, String CI, String cargo)
    {
        super(nombre, apellido, CI);
        this.cargo = cargo;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo(String cargo)
    {
        this.cargo = cargo;
    }

    public void imprimirProfesor()
    {
        System.out.println("Datos del profesor");
        System.out.println("Nombre " + nombre);
        System.out.println("Apellido " + getApellido());
        System.out.println("CI " + getCI());
        System.out.println("Cargo " + cargo);

        super.metodoSobreEscrito();
        metodoSobreEscrito();
    }

    public void imprimirProfesor(String x)
    {
        super.metodoSobreEscrito();
        metodoSobreEscrito();
    }

    public void metodoSobreEscrito()
    {
        System.out.println("imprimir desde Profesor");
    }
}
