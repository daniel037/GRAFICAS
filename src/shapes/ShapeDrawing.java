/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JComponent;

/**
 *
 * @author oop
 */
public class ShapeDrawing  extends JComponent{
    
    private Vector<Shape> shapes;
    //------------------------------------------------------------
    public ShapeDrawing()
    {
        shapes = new Vector<>();
    }
    //---------------------------------------------------------------
    
    public void paint(Graphics g)
    {
        for(Shape s: shapes)
        {
            s.draw(g);
            
        }
    }
    //-------------------------------------------------------------
    public void add(Shape s)
    {
        shapes.add(s);
        repaint();
    }
}
