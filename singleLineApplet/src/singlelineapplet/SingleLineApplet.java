/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelineapplet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;

/**
 *
 * @author hp
 */
public class SingleLineApplet extends Applet {

    Line l1;
    Vector<Line>Lines;
    public class  Line
    {
        int x1,y1,x2,y2;

        public Line(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public Line() {
        }
        
        
    
        
        
    }
    
    @Override
    public void init()
    {
        l1=new Line();
        Lines=new  Vector <>();
        this.addMouseListener(
                new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mousePressed(MouseEvent me) {
            l1.x1=me.getX();
            l1.y1=me.getY();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                Line l2=new Line(l1.x1,l1.y1,l1.x2,l1.y2);
                Lines.add(l2);
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }

        );
        this.addMouseMotionListener(
                new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent me) {
              l1.x2=me.getX();
              l1.y2=me.getY();
              repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
        
        );
        
        
        
        
    }
    @Override
    public void paint(Graphics g)
    {
        int i;
      g.drawLine(l1.x1, l1.y1,l1.x2, l1.y2);

        for(i=0;i<Lines.size();i++)
        {
            g.drawLine(Lines.get(i).x1, Lines.get(i).y1,Lines.get(i).x2, Lines.get(i).y2);
        }
    }
    /**
     * @param args the command line arguments
     */

    
}
