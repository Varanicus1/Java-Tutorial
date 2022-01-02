import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageLoader {
    
    BufferedImage image;

    Icon icon;

    public ImageLoader(){

        try {
            image = ImageIO.read(new File("rsc/image.png")); //für bilder
            icon = new ImageIcon("rsc/icon.png"); //für button icons
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
}
