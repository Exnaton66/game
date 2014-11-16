package klugmanVSkilikhevich;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Администратор on 15.11.2014.
 */
public class Rocket {
    Image img = new ImageIcon("rocket.png").getImage();

    public int getY(){
        return y;
    }
    private int y=450;

    public void moveV(){
        if (y!=-10)
            y--;
    }

}
