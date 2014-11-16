package klugmanVSkilikhevich;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Администратор on 15.11.2014.
 */
public class Bg extends JPanel implements ActionListener{
    Timer mainTimer = new Timer(1, this);
    private boolean end = false;
    private boolean beg = false;
    Image img = new ImageIcon("bg1.jpg").getImage();
    JPanel panel;

    Gun gun = new Gun();
    Rocket rock = new Rocket();
    NFO n = new NFO();

    public Bg(){
        mainTimer.start();
    }

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
        g.drawImage(rock.img, Game.posYR + 41, Game.rocketYPosition, null);
        g.drawImage(gun.img, Game.posYR, 450, null);
        g.drawImage(n.img, n.x, n.y, null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!end){
            n.moveR();
            if(n.x==650){end=true;}
        }else {n.moveL();
        if(n.x==10){end=false;}}

        repaint();

    }
}
