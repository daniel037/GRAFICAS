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
public class Rectangulo extends Shape{

    public Rectangulo(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }
//-----------------------------------------------------------------------------------
    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
        
    }
    //----------------------------------------------
}
