/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.text.using.keyboard;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_UP;
import java.awt.event.KeyListener;

/**
 *
 * @author hp
 */
public class MovingTextUsingKeyboard extends Applet {

    int x=50;
    int y=50;

    @Override
    public void init() {
        setFocusable(true);
       requestFocusInWindow();
        this.addKeyListener(
                new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                int key;
                key = e.getKeyCode();
                if(x<=getWidth() && y<=getHeight())
                {
                switch (key) {
                    case KeyEvent.VK_DOWN:
                        y++;
                        repaint();
                        break;
                    case KeyEvent.VK_UP:
                        y--;
                        repaint();
                        break;
                    case VK_RIGHT:
                        x++;
                        repaint();
                        break;
                    case VK_LEFT:
                        x--;
                        repaint();
                        break;
                    default:
                        x = 0;
                        y = 0;
                        break;
                }
            }
                else
                {
                    x=50;
                    y=50;
                    repaint();
                    
                }
            }
            @Override
            public void keyTyped(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent ke) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        );

   

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("JAVA", x, y);
    }
    /**
     * @param args the command line arguments
     */

}
