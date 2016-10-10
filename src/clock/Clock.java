/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.awt.Graphics;
import java.util.Calendar;
import javax.swing.JComponent;

/**
 *
 * @author Daniel
 */
public class Clock extends JComponent{
    
    private Battery b;
    //------------------------------------------
    public Clock()
    {
        b = new Battery(this);
        b.start();
    }
    
    //------------------------------------------------------------
    public void paint(Graphics g)
    {
        int cx= getWidth()/2;
        int cy= getHeight()/2;
        int r = cx<cy ? cx-10 :cy-10;
        
        g.drawOval(cx-r, cy-r, r*2,r*2);
        
        int x,y;
        double a;
        for (a = 0; a<= 2* Math.PI; a+= 2* Math.PI/12) 
        {
            x= cx + (int)(Math.sin(a) * (r-5));
            y= cy - (int)(Math.cos(a) * (r-5));
            g.drawOval(x-2, y-2, 4, 4);
        }    
        
        Calendar c = Calendar.getInstance();
        
        int h= c.get(Calendar.HOUR);
        int m= c.get(Calendar.MINUTE);
        int s= c.get(Calendar.SECOND);
        
        //-----------------dibujar linea de segundero-----------------------------
        a = (2* Math.PI/60)*s;
        x= cx + (int)(Math.sin(a) * (r-5)); ;
        y= cy - (int)(Math.cos(a) * (r-5));;
        g.drawLine(cx, cy, x, y);
              
        //---------------dibujar linea de minutero------------------------------
        a = (2* Math.PI/60)*m;
        x= cx + (int)(Math.sin(a) * (r-5)*(3/4.0)) ;
        y= cy - (int)(Math.cos(a) * (r-5)*(3/4.0));
        g.drawLine(cx, cy, x, y);        
        //-------------dibujar linea de horero-----------
        a = (2* Math.PI/12)*h;
        x= cx + (int)(Math.sin(a) * (r-5)/2.0) ;
        y= cy - (int)(Math.cos(a) * (r-5)/2.0);
        g.drawLine(cx, cy, x, y);            

        
    }    
}
