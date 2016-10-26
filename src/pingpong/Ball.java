/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pingpong;

import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oop
 */
public class Ball extends Thread {
    private int x,y;
    private short dh,dv;
    private AnimationArea area;
    //--------------------------------------------------------------------------
    public Ball(int x, int y, AnimationArea a)
    {
        this.x     =x;
        this.y     =y;
        this.dh    = +1;
        this.dv    = +1;
        this.area  = a;
    }
    //--------------------------------------------------------------------------
    public void draw(Graphics g)
    {
        g.drawOval(x-15,y-15,30,30);
    }
    //--------------------------------------------------------------------------
    public void run()
    {
        while(true)
        {
            int w = area.getWidth()-15;
            int h = area.getHeight()-15;
            
            if(x <= 15) dh = +1;
            if(y <= 15) dv = +1;
            if(x >= w) dh = -1;
            if(y >= h) dv = -1;
            x += dh;
            y += dv;
            area.repaint();
            try {
             sleep(10);
            } catch (InterruptedException ex) {
            }
        }
    }
}