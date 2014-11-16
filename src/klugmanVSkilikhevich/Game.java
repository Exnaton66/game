package klugmanVSkilikhevich;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Администратор on 15.11.2014.
 */
public class Game {
    static int posYR;
    static int rocketYPosition;

    private static JFrame window;
    private static JPanel rocket;

    public static void main(String []args){
        window = new JFrame();
        window.setSize(800, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.add(new Bg());
        window.setVisible(true);
        window.setResizable(false);
        setListeners();
        moving();
//        frame.setLayout(null);

    }

    private static void moving() {
        while (true) try {
            Thread.sleep(2);
            if (posYR >= 630) {
                posYR = 630;
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    private static void setListeners() {
        window.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                posYR = e.getX();
            }
        });

        window.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                fire();
            }
        });
    }

    private static void fire() {
        //взять коордитанати пушки із того місця запустить ракєту.
        //циклом for зробить щоб координати ракети мінялись лише по y
        //перемальовувать rePaint();
        //зробить шоб ракєта пропадала, коли долетить до кінечної точки

        for (int i = 450; i < 10; i--) {
            rocketYPosition--;
            if(hasShooted()) {
                //викликаєш метод де падає тарілка і убираєш ракєту
                // викидаєш віконечко, шо ти попав по тарілці.
            } else {
                //убираєш ракєту
            }
        }
    }

    private static boolean hasShooted() {
        //перевірка чи попав, чи ні
        return false;
    }
}
