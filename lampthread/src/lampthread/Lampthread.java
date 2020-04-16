/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lampthread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class Lampthread extends Applet implements Runnable {

    Color[] colors = {Color.BLACK, Color.MAGENTA, Color.RED};
    int index = 0;
    Thread th;

    @Override
    public void init() {
        th = new Thread(this);
        th.start();
    }

    @Override
    public void paint(Graphics g) {
        // lamp platform
        g.drawRect(30, 250, 250, 30);

        //lamp base
        g.drawLine(125, 250, 125, 160);
        g.drawLine(175, 250, 175, 160);

        //lamp shade (top and bottom edges)
        g.drawArc(85, 157, 130, 50, -65, 312);
        g.drawArc(85, 87, 130, 50, 62, 58);

        //lamp shade (sides)
        g.drawLine(85, 177, 119, 89);
        g.drawLine(215, 177, 181, 89);

        //dots on shade
        g.setColor(colors[index]);
        g.fillArc(78, 120, 40, 40, 63, -174);
        g.fillOval(120, 96, 40, 40);
        g.fillArc(173, 100, 40, 40, 110, 180);

    }

    @Override
    public void run() {
        while (true) {
            index++;

            if (index >= colors.length) {
                index = 0;
            }

            try {
                repaint();

                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lampthread.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
