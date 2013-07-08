package mx.jhonfx.swing;

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;

public class SumaNumeros extends JFrame implements ActionListener {
    
    /**
	 * @author jhonFx
	 */
	private static final long serialVersionUID = 1L;
	private JPanel jp;
    private JButton calcular, limpiar;    
    private JFormattedTextField jtfnum1,jtfnum2,jtfresult;
    private final NumberFormat fmt = NumberFormat.getInstance();
    private JLabel lblnum1,lblnum2,lblresult;

    public SumaNumeros() throws Exception{
        jp = new JPanel(null);

        lblnum1 = new JLabel("Numero 1");
        lblnum1.setBounds(40,20,120,25);

        jtfnum1 = new JFormattedTextField(fmt);
        jtfnum1.setBounds(120,20,120,25);

        lblnum2 = new JLabel("Numero 2");
        lblnum2.setBounds(40,60,120,25);

        jtfnum2 = new JFormattedTextField(fmt);
        jtfnum2.setBounds(120,60,120,25);

        lblresult = new JLabel("Resultado");
        lblresult.setBounds(40,100,120,25);

        jtfresult = new JFormattedTextField(fmt);
        jtfresult.setBounds(120,100,120,25);
        jtfresult.setEditable(false);

        calcular = new JButton("Calcular");
        calcular.setBounds(20,140,120,25);
        calcular.addActionListener(this);
        
        limpiar = new JButton("Limpiar");
        limpiar.setBounds(150,140,120,25);
        limpiar.addActionListener(this);

        jp.add(lblnum1);
        jp.add(lblnum2);
        jp.add(lblresult);
        jp.add(jtfnum1);
        jp.add(jtfnum2);
        jp.add(jtfresult);
        jp.add(calcular);
        jp.add(limpiar);

        this.setContentPane(jp);
        this.setSize(300,220);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == calcular){
            suma();
        }
        if(evento.getSource() == limpiar){
        	limpiar();
        }
    }

    public void suma(){     
        
        try{
        	Number a = (Number) jtfnum1.getValue();
            Number b = (Number) jtfnum2.getValue();
            
            jtfresult.setValue(a.intValue() + b.intValue());
        	}catch (Exception e) {
			// TODO: handle exception
        	JOptionPane.showMessageDialog(null, "Error al sumar, debe introducir numeros!!");
        	System.out.print(e);
		}
    	        
    }
    
    public void limpiar(){
    	jtfnum1.setText("");
    	jtfnum2.setText("");
    	jtfresult.setText("");
    }

    public static void main(String [] t) throws Exception{
        new SumaNumeros();
    }
}
