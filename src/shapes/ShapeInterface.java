/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author oop
 */
public class ShapeInterface extends JFrame{
    
    private ShapeDrawing   drawing;
    private int            ShapeOption =0;
    private Shape          current=null;
    
    //-----------------------------------------------------------
    
    public ShapeInterface()
    {
        super("Shape Drawing");
        setSize(600,400);
        widgets();
        evenst();
        setVisible(true);
    }
    //--------------------------------------------
    private void widgets()
    {
        drawing = new ShapeDrawing();
        add(drawing);
    }
    //--------------------------------------
    private void evenst()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //----------------------------------------------------------------------
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch(e.getKeyCode())
                {
                    case KeyEvent.VK_T:
                        ShapeOption =1;
                        break;
                    case KeyEvent.VK_R:
                        ShapeOption=2;
                        break;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        //-------------------------------------------
        
        drawing.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
                switch(ShapeOption)
                {
                    case 1:
                        current = new Tiangulo(e.getX(), e.getY(),0, 0, Color.yellow,1);
                        break;
                    case 2:
                        current = new Rectangulo(e.getX(),e.getY() ,0 , 0, Color.yellow);
                        break;
                    default:
                        return;
                }
                drawing.add(current);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                current = null;
            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
            }
        });
        //-----------------------------------------------------------------
        drawing.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                if(current != null)
                {
                    current.resize(e.getX()-current.getX(),e.getY()-current.getY());
                    drawing.repaint();
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
        
    }
    //-----------------------------------------
    
    //--------------------------------------------
    public static void main(String[] args) {
        new ShapeInterface();
    }
}
