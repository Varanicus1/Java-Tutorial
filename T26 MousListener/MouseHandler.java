import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseHandler implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        // wenn man drückt und wieder loslässt
        System.out.println("Clicked on x: "+e.getX() + ", y: " + e.getY() );
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // wenn man drückt
        System.out.println("Clicked on x: "+e.getX() + ", y: " + e.getY() );
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // wenn man wieder loslässt
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // wenn man in das jframe rein geht
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // wenn man aus dem jframe rausgeht
        
    }
    
}
