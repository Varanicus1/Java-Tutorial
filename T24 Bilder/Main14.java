import javax.swing.JButton;
import javax.swing.JFrame;


public class Main14 {


    ImageLoader il;
    JButton button;

    public Main14(){

        il= new ImageLoader();
    
        JFrame frame = new JFrame("Fenster");
        frame.setSize(800,600); //größe des fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das das programm gestoppt wird wenn man auf x drückt
        frame.setResizable(false); //größe manuell änderbar gleich flasch
        frame.setLocationRelativeTo(null); //Zentriert das fenster
        frame.setLayout(null); //Layout auf null das man mit positionierung arbeiten kann
        frame.requestFocus(); //fenster bekommt den fokus

        Draw2 draw = new Draw2();
        draw.setBounds(0,0,800,600); //Größe
        draw.setVisible(true);
        frame.add(draw);

        button=new JButton();
        button.setBounds(400,400,70,70);
        button.setIcon(il.icon);
        button.setVisible(true);
        frame.add(button);
        frame.setVisible(true);
    
        
    }

    public static void main(String[] args){
        new Main14();
    }
    
}
