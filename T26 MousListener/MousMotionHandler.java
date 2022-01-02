import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MousMotionHandler implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
        // wenn linke maus taste gedrückt ist und dann bewegen
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // wenn wir die maus bewegen
        System.out.println("x: "+e.getX() + ", y: " + e.getY() );
        
    }
    
}
