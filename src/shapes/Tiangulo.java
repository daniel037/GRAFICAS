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
 * @author oop
 */
public class Tiangulo extends Shape {
    
    private int orientation;
//-----------------------------------------------------------------
    public Tiangulo(int x, int y, int width, int height, Color color,int orientation) {
        super(x, y, width, height, color);
        this.orientation = orientation;
    }
//----------------------------------------------------------------------------------------------
    public void draw(Graphics g) {
        switch(orientation)
        {
            case 1:
                g.drawPolygon(new int[]{x+width/2,     x+width,         x},
                              new int[]{        y,    y+height,  y+height}, 3 );
                break;
        }
    }
    //-----------------------------------------
}
