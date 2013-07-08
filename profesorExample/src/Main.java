/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import datos.Profesor;

/**
 *
 * @author ricardocasanova
 */
public class Main
{
    public static void main(String [] args)
    {
        Profesor elProfesor = new Profesor("Ricardo", "Casanova", "14XXXXXX", "profesor");

        elProfesor.imprimirProfesor();

        elProfesor.metodoSobreEscrito();
    }

}
