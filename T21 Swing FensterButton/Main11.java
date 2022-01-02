import java.awt.Color;


import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main11 {

     static JButton button;

    public Main11(){
    
        JFrame frame = new JFrame("Fenster");
        frame.setSize(800,600); //größe des fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das das programm gestoppt wird wenn man auf x drückt
        frame.setResizable(false); //größe manuell änderbar gleich flasch
        frame.setLocationRelativeTo(null); //Zentriert das fenster
        frame.setLayout(null); //Layout auf null das man mit positionierung arbeiten kann
        frame.requestFocus(); //fenster bekommt den fokus


        


        button= new JButton("Drück mich");
        button.setBounds(25,25,150,40); //x y länge breite
        button.setBackground(new Color(100,200,100));
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        button.addActionListener(new ActionHandler());

        button.setVisible(true);
        frame.add(button);
        frame.setVisible(true);
    
        
    }

    public static void main(String[] args){
        new Main11();
    }
    
}
