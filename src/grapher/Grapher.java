/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapher;

import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;
import javax.swing.JComponent;

/**
 *
 * @author Juan Pablo Lagos 
 */
public class Grapher extends JComponent
{
    private Vector<Point> points;
    //--------------------------------------------------------------------------
    public Grapher()
    {
        points = new Vector<Point>();
    }
    //--------------------------------------------------------------------------
    public void paint (Graphics g)
    {
        if(points.isEmpty()) return;
        Point p1 = points.elementAt(0);
        Point p2 = null;
        for(int i=0; i<points.size(); i++)
        {
            p2= p1;
            p1= points.elementAt(i);
            g.drawLine((int)p1.getX(), (int)p1.getY(), 
                       (int)p2.getX(), (int)p2.getY());
        }
        
    }
    //--------------------------------------------------------------------------
    public void addpoint(int x, int y)
    {
        points.add(new Point(x,y));
    }
    //--------------------------------------------------------------------------
    public void clear()
    {
        points.clear();
    }
    //--------------------------------------------------------------------------
    public void moveright()
    {
        Point x;
        
        for(int i=0; i<points.size();i++)
        {
            x=points.elementAt(i);
            points.elementAt(i).setLocation((int)x.getX()+1, (int)x.getY()); 
        }        
    }    
    
}
