import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Biotipo{
   
     public static void main(String[] args)throws Exception {
        
        SwingUtilities.invokeLater(new Runnable(){public void run(){new Ventana().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;}});
    }   
    
}
class Ventana extends JFrame{
    public final static int ANCHO=550;
    public final static int ALTO=90;
    private JPanel panel;
    private JButton btnActiva;
    private JButton btnSalir;
    private JLabel lblResultado;
    
    Ventana(){
        setTitle("::Calculadora de biotipos::"+getFecha());
        setSize(ANCHO,ALTO);
        setVisible(true);
        add(getGUI());
    }
    static String getFecha(){
        String strFecha=null;
        try{
            java.util.Date fecha=new java.util.Date();
            java.text.SimpleDateFormat formato = new java.text.SimpleDateFormat("'Hoy es' EEEEEEEEE dd 'de' MMMMM 'de' yyyy");
            strFecha=formato.format(fecha);
        }catch(Exception ex){
            System.err.println("error: "+ex.getCause());
        }
        return strFecha;
    }
    public JPanel getGUI(){
        if(panel==null){
            panel=new JPanel();
            panel.setVisible(true);
            panel.add(getActiva());
            panel.add(getSalir());
            lblResultado=new JLabel("<html><font color='blue'>--</font></html>");
            lblResultado.setVisible(false);
            panel.add(lblResultado);
        }
        return panel;
    }
    public JButton getActiva(){
        if(btnActiva==null){
            btnActiva=new JButton("<html><font color='white'>Calcular</font></html>");
            btnActiva.setBackground(Color.black);
            btnActiva.setToolTipText("calcular ahora...");
            btnActiva.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    String peso="";
                    String talla="";
                    double desviacion=0.0;
                    String miPeso="";
                    String miTalla="";
                    
                    HashMap<String,Double> mapaPeso=new HashMap<String,Double>();
                    HashMap<String,Double> mapaEstatura=new HashMap<String,Double>();
            try{
            //llenar mapaPeso
            mapaPeso.put("85.54",3.0);
            mapaPeso.put("83.79",2.75);
            mapaPeso.put("82.04",2.5);
            mapaPeso.put("80.29",2.25);
            mapaPeso.put("78.54",2.0);
            mapaPeso.put("76.79",1.75);
            mapaPeso.put("75.04",1.5);
            mapaPeso.put("73.29",1.25);
            mapaPeso.put("71.54",1.0);
            mapaPeso.put("69.79",0.75);
            mapaPeso.put("68.04",0.50);
            mapaPeso.put("66.29",0.25);
            mapaPeso.put("64.54",0.0);
            mapaPeso.put("62.79",-0.25);
            mapaPeso.put("61.04",-0.50);
            mapaPeso.put("59.29",-0.75);
            mapaPeso.put("57.54",-1.0);
            mapaPeso.put("55.79",-1.25);
            mapaPeso.put("54.04",-1.50);
            mapaPeso.put("52.29",-1.75);
            mapaPeso.put("50.54",-2.0);
            mapaPeso.put("45.79",-2.25);
            mapaPeso.put("47.04",-2.5);
            mapaPeso.put("45.29",-2.75);
            mapaPeso.put("43.54",-3.0);
            //llenar mapaEstatura
            mapaEstatura.put("1.87",3.0);
            mapaEstatura.put("1.86",2.75);
            mapaEstatura.put("1.85",2.50);
            mapaEstatura.put("1.83",2.23);
            mapaEstatura.put("1.82",2.0);
            mapaEstatura.put("1.81",1.75);
            mapaEstatura.put("1.79",1.50);
            mapaEstatura.put("1.78",2.25);
            mapaEstatura.put("1.77",1.0);
            mapaEstatura.put("1.75",0.75);
            mapaEstatura.put("1.74",0.50);
            mapaEstatura.put("1.73",0.25);
            mapaEstatura.put("1.71",0.0);
            mapaEstatura.put("1.7",-0.25);
            mapaEstatura.put("1.69",-0.50);
            mapaEstatura.put("1.67",-0.75);
            mapaEstatura.put("1.66",-1.0);
            mapaEstatura.put("1.65",-1.25);
            mapaEstatura.put("1.63",-1.50);
            mapaEstatura.put("1.62",-1.75);
            mapaEstatura.put("1.61",-2.0);
            mapaEstatura.put("1.59",-2.25);
            mapaEstatura.put("1.58",-2.50);
            mapaEstatura.put("1.57",-2.75);
            mapaEstatura.put("1.55",-3.0);
        }
        catch(Exception ex){
            System.out.println("1. Ha ocurrido un error: "+ex.getCause());
        }
            try{
            miPeso=JOptionPane.showInputDialog("Tu peso es de: ");
            miTalla=JOptionPane.showInputDialog("Tu estatura es de: ");
            }catch(Exception ex){
            System.out.println("2. Ha ocurrido un error: "+ex.getCause());
            }
            
             try{
            peso=getPeso(mapaPeso,String.valueOf(miPeso));
            talla=getTalla(mapaEstatura,String.valueOf(miTalla));
            desviacion=Double.parseDouble(peso)-Double.parseDouble(talla);
            if(desviacion<0){
                lblResultado.setVisible(true);
                lblResultado.setText("tu biotipo es: longitipo");
                JOptionPane.showMessageDialog(null, "tu biotipo es: longitipo", "Aviso del sistema", JOptionPane.WARNING_MESSAGE, new ImageIcon("longitipo.jpg"));
            }else if(desviacion>0){
                lblResultado.setVisible(true);
                lblResultado.setText("tu biotipo es: braquitipo");
                JOptionPane.showMessageDialog(null, "tu biotipo es: braquitipo", "Aviso del sistema", JOptionPane.WARNING_MESSAGE, new ImageIcon("longitipo.jpg"));
            }else{
                lblResultado.setVisible(true);
                lblResultado.setText("tu biotipo es: normotipo");
                JOptionPane.showMessageDialog(null, "tu biotipo es: normotipo", "Aviso del sistema", JOptionPane.WARNING_MESSAGE, new ImageIcon("longitipo.jpg"));
            }
            }
            catch(Exception ex){
                System.out.println("3. Ha ocurrido un error: "+ex.getCause());
            }
                }
            });
        }
        return btnActiva;
    }
    public JButton getSalir(){
        if(btnSalir==null){
            btnSalir=new JButton("<html><font color='red'>Salir</font></html>");
            btnSalir.setBackground(Color.black);
            btnSalir.setToolTipText("salir...");
            btnSalir.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);
                }
            });
        }
        return btnSalir;
    }
    static String getPeso(HashMap<String,Double> m,String peso){
        String cadPeso=null;
        try{
            Iterator it=m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry)it.next();
                if(e.getKey().equals(peso)){ 
                    System.out.println("peso: "+e.getValue());
                    cadPeso=String.valueOf(e.getValue());
                }
            }
        }catch(Exception ex){
            System.err.println("error: "+ex.getCause());
        }
        return cadPeso;
    }
    static String getTalla(HashMap<String,Double> m,String talla){
        String cadTalla=null;
        try{
            Iterator it=m.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry e = (Map.Entry)it.next();
                if(e.getKey().equals(talla)){ 
                    System.out.println("talla: "+e.getValue());
                    cadTalla=String.valueOf(e.getValue());
                }
            }
        }catch(Exception ex){
            System.err.println("error: "+ex.getCause());
        }
        return cadTalla;
    }
}