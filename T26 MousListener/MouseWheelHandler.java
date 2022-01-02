import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelHandler implements MouseWheelListener{

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
        // Zahnrat drechrichtung

        System.out.println("Scrolled: "+ e.getWheelRotation());
        
    }

}