/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;
import javax.swing.JComponent;

/**
 *
 * @author oop
 */
public class ShapeDrawing  extends JComponent{
    
    private Vector<Shape> shapes;
    private Shape focused;
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
        if(focused != null)
        {
            g.setColor(Color.RED);
            g.drawRect(focused.getX()-2,focused.getY()-2,focused.getWidth()+4,focused.getHeight()+4);
        }
    }
    //-------------------------------------------------------------
    public void add(Shape s)
    {
        shapes.add(s);
        repaint();
    }
    //----------------------------------------------------------------
    public Shape setFocus(int mx, int my)
    {
        focused = null;
        for(Shape s : shapes)
        {
            if(s.isFocused(mx, my))
            {
                focused = s;
                break;
            }
        }
        repaint();
        return  focused;
    }
}
