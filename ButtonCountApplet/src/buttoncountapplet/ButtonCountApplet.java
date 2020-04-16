/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttoncountapplet;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author hp
 */
public class ButtonCountApplet extends Applet {
    int x;
    Button b,b1;
    @Override
    public void init()
    {
        b=new Button("Increase");
        b1=new Button("Decrease");
        b.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        
                        if(x>=0 && x<10)
                {
                        x++;
                        repaint();
                }
                    }
                }
                           );
        add(b);
    
    b1.addActionListener(
                new ActionListener()
                {
                    public void actionPerformed(ActionEvent e)
                    {
                        
                        if(x>0 && x<=10)
                {
                        x--;
                        repaint();
                }
                    }
                }
                           );
        add(b1);
}
    @Override
        public void paint(Graphics g)
        {
            g.drawString("click count is :"+x,20,50);

        }
        
    }
    

    /**
     * @param args the command line arguments
     */

    

