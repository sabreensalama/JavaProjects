/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marquee.thread;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class MarqueeThread extends Applet implements Runnable {

    Thread th;
    int x, y;

    @Override
    public void init() {
        th = new Thread(this);
        th.start();
        x = 30;
        y = 20;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("JAVA WORD", x, y);
    }

    @Override
    public void run() {
        while (true) {

            if (x > getWidth()) {
                x = 0;
            }
            else{
            x = x + 40;

            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(MarqueeThread.class.getName()).log(Level.SEVERE, null, ex);
            }
            }

        }
    }

}
/**
 * @param args the command line arguments
 */
