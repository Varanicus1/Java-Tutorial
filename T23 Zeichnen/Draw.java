import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Color;
import java.awt.Font;

public class Draw extends JLabel{
    
    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON); //weichzeihnen

        //Farbdarstellvarianten
        g.setColor(Color.BLACK); 
        g.setColor(new Color(150,25,140));
        g.setColor(Color.decode("#2980b9"));

        //g.drawLine(0, 0, 200, 200);
        g.fillRect(100, 100, 50, 50); //ausgefüllt
        g.drawRect(100, 200, 50, 50); //nur rahmen

        g.fillRoundRect(100, 300, 50, 50, 20, 20);
        g.fillOval(100, 400, 50, 50);

        g.setFont(new Font("Arial", Font.PLAIN,25)); //Schriftart und größe
        g.drawString("Hallo",200,100); //schreiben

        g.fillArc(100, 500, 50, 50, 0, 90); //startet rechts am rand und geht dann 90 nach oben

        repaint();
    }
}
