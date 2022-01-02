import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuHandler implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == Main12.item1){
            System.out.println("Neu...");

        }else if(e.getSource() == Main12.item2){
            System.exit(0);
        }
        
    }
    
}
