import javax.swing.JFrame;

public class Main16 {

    public static void main(String[] args){
        JFrame frame = new JFrame("Fenster");
        frame.setSize(800,600); //größe des fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das das programm gestoppt wird wenn man auf x drückt
        frame.setResizable(false); //größe manuell änderbar gleich flasch
        frame.setLocationRelativeTo(null); //Zentriert das fenster
        frame.setLayout(null); //Layout auf null das man mit positionierung arbeiten kann
        
        frame.addKeyListener(new KeyHandler());
        frame.addMouseListener(new MouseHandler());
        frame.addMouseMotionListener(new MousMotionHandler());
        frame.addMouseWheelListener(new MouseWheelHandler());

        frame.requestFocus(); //fenster bekommt den fokus
        frame.setVisible(true);
    }
    
}
