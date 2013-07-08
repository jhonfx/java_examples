
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author JhonFx
 */
public class Panel extends JFrame implements MouseMotionListener {

    private ArrayList puntos;

    public Panel(){
        this.setSize(400,400);
        this.setVisible(true);
        puntos = new ArrayList();
        this.addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(Color.RED);
        g.fillRect(0, 0, 400, 400);
        dibujarPuntos(g);
    }

    public void dibujarPuntos(Graphics g){
        for(int i=0; i<puntos.size(); i++){
            g.setColor(Color.BLUE);
            Point aux = (Point) puntos.get(i);
            g.drawRect(aux.x, aux.y, 2, 2);
        }
    }

    public void mouseDragged(MouseEvent e) {
        Point p = new Point(e.getX(),e.getY());
        puntos.add(p);
        this.repaint();
    }

    public void mouseMoved(MouseEvent e) {
        
    }

    public static void main(String [] args){
        new Panel();
    }
}
