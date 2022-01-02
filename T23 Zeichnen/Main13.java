import javax.swing.JFrame;


public class Main13 {



    public Main13(){
    
        JFrame frame = new JFrame("Fenster");
        frame.setSize(800,600); //größe des fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das das programm gestoppt wird wenn man auf x drückt
        frame.setResizable(false); //größe manuell änderbar gleich flasch
        frame.setLocationRelativeTo(null); //Zentriert das fenster
        frame.setLayout(null); //Layout auf null das man mit positionierung arbeiten kann
        frame.requestFocus(); //fenster bekommt den fokus

        Draw draw = new Draw();
        draw.setBounds(0,0,800,600); //Größe
        draw.setVisible(true);
        frame.add(draw);

        frame.setVisible(true);
    
        
    }

    public static void main(String[] args){
        new Main13();
    }
    
}
