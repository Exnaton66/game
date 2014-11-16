package klugmanVSkilikhevich;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Администратор on 15.11.2014.
 */
public class Game {
    static int posYR;
    public static void main(String []args){
        JFrame frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new Bg());
        frame.setVisible(true);
        frame.setResizable(false);
//        frame.setLayout(null);
        while (true) try {
            Thread.sleep(1);
            frame.addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseMoved(MouseEvent e) {
                    posYR = e.getX();

                }

            });
            if (posYR >= 630) {
                posYR = 630;
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
