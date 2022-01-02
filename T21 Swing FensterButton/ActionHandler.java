import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ActionHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == Main11.button){ // testet ob es der button ist wichtig bei mehren button

            System.out.println("yey, du hast mich gedrückt");
        }
        
    }
    
}
