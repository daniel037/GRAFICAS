/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Daniel
 */
public abstract class Shape {
    protected int x,y;
    protected int width,height;
    protected Color color;
    
    //-----------------------------------

    public Shape(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }
    
    //-------------------------------------------------------
    public void move(int x,int y)
    {
        this.x= x;
        this.y= y;
    }
    //--------------------------------------------------------------------------
    public void resize (int width, int height)
    {
        this.width = width;
        this.height = height;
    }
    //--------------------------------------------------
    public abstract  void draw(Graphics g);
    //---------------------------------------------------------

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }
}
