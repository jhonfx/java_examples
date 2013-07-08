/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaces;
import javax.swing.JOptionPane;

/**
 *
 * @author JhonFx
 */


public class Cuadrado implements Figura{

    int lado;        
    String tipo = JOptionPane.showInputDialog("Que tipo de figura es? ");

    public Cuadrado(int ladoParametro){
        lado = ladoParametro;        
    }

    public int area(){
        return lado * lado;
    }

    public int perimetro(){
        return lado*4;
    }

    public String tipoFigura(){

        if(tipo.isEmpty()){
            return "No existe un tipo de Figura";
        }else if(tipo.equals("Cuadrado")){
            return "El tipo de figura es: " + tipo;        
        }else{
            return tipo = "No es un tipo valido";
        }
    }
}
