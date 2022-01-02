import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        // taste drückt
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // taste hält
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            System.out.println("links");
        } 

        //kombination wenn shift dazu gedrückt wird
       if(e.isShiftDown()){
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            System.out.println("shift + links");
        }  
       }

       switch(e.getKeyCode()){
           case KeyEvent.VK_W:
             System.out.println("w");
             break;
           case KeyEvent.VK_A:
             System.out.println("a");
             break;
           case KeyEvent.VK_S:
             System.out.println("s");
             break;
           case KeyEvent.VK_D:
             System.out.println("d");
             break;

       }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // taste loslässt
        
    }
    
}
