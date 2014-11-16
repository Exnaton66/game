package klugmanVSkilikhevich;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 15.11.2014.
 */
public class NFO {
    Image img = new ImageIcon("Ufo.png").getImage();

    int x = 10;
    int y = 10;

    public void moveR(){
        x++;
    }
    public void moveL(){
        x--;
    }

}
