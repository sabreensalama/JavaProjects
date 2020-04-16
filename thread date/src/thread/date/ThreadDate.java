/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.date;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ThreadDate  extends Applet implements Runnable{
 Thread th;
 @Override
 public void init ()
 {
     th=new Thread (this);
     th.start();
 }
 @Override
    public void paint(Graphics g)
    {
        Date d=new Date();
        g.drawString(d.toString(),50,100);
    }
 @Override
    public void run()
    {
        while(true)
        {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadDate.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
        
    }
    /**
     * @param args the command line arguments
     */

  

