package mx.jhonfx.swing;

import javax.swing.*;
import java.awt.*;

public class Pantalla extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel principal;
	public static JTextField jnombre, japellidop, japellidom;    
    public JLabel lnombre, lapellidop, lapellidom, ima0;   
    
    public Pantalla(){
    	super("Pantalla");
    	principal = new JPanel();
		principal.setLayout(null);
		
		jnombre = new JTextField();
		japellidop = new JTextField();
		japellidom = new JTextField();
		lnombre = new JLabel("Nombre: ");
		lapellidop = new JLabel("Apellido Paterno: ");
		lapellidom = new JLabel("Apellido Materno: ");
		
		lnombre.setBounds(new Rectangle(20,20,120,25));//etiqueta		
		principal.add(lnombre);
        jnombre.setBounds(new Rectangle(130,20,120,25));//texto
        principal.add(jnombre);
        lapellidop.setBounds(new Rectangle(20,60,120,25));//etiqueta
        principal.add(lapellidop);
        japellidop.setBounds(new Rectangle(130,60,120,25));//texto
        principal.add(japellidop);
        lapellidom.setBounds(new Rectangle(20,100,120,25));
        principal.add(lapellidom);
        japellidom.setBounds(new Rectangle(130,100,120,25));
        principal.add(japellidom);
        
		this.setIconImage(new ImageIcon(Pantalla.class.getResource("devil.png")).getImage());
		this.getContentPane().add(principal);
		this.setTitle("Pantalla Basica Swing");
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setVisible(true);    	
    }
    
    public static void main(String[] args){    	
	 	new Pantalla();
    }
	
	

}

