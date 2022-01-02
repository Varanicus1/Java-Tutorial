import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main12 {

   static JMenuItem item1, item2;  //sind die dropdowns

    public Main12(){
    
        JFrame frame = new JFrame("Fenster");
        frame.setSize(800,600); //größe des fenster
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //das das programm gestoppt wird wenn man auf x drückt
        frame.setResizable(false); //größe manuell änderbar gleich flasch
        frame.setLocationRelativeTo(null); //Zentriert das fenster
        frame.setLayout(null); //Layout auf null das man mit positionierung arbeiten kann
        frame.requestFocus(); //fenster bekommt den fokus

        JMenuBar bar = new JMenuBar(); //ist die komplette leiste
        JMenu menu = new JMenu("Datei"); //ist ein dropdown menu

        item1 = new JMenuItem("Neu"); //sind die dropdowns
        item1.addActionListener(new MenuHandler());
        item2 = new JMenuItem("Beenden");
        item2.addActionListener(new MenuHandler());

        //menu.insert(item2, 0); alternativ zu add wenn du eine feste stelle zuweisen willst

        menu.add(item1);
        menu.addSeparator(); //trennstrich
        menu.add(item2);

        bar.add(menu);




        frame.setJMenuBar(bar);
        frame.setVisible(true);
    
        
    }

    public static void main(String[] args){
        new Main12();
    }
    
}
