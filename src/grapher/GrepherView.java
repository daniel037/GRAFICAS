/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grapher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author oop
 */
public class GrepherView extends JFrame
{
    private Grapher graph;
    //--------------------------------------------------------------------------
    public GrepherView()
    {
        super("Grapher");
        setSize(400, 300);
        widgets();
        events();
        setVisible(true);        
    }
    //--------------------------------------------------------------------------
    private void widgets()
    {
        graph = new Grapher();
        add(graph);
                
    }
    //--------------------------------------------------------------------------
    private void events()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //----------------------------------------------------------------------
        graph.addMouseMotionListener(new MouseMotionListener() {            
            public void mouseDragged(MouseEvent e) {
                graph.addpoint(e.getX(), e.getY());
                graph.repaint();
            }
            public void mouseMoved(MouseEvent e) {
                
            }
        }); 
        //----------------------------------------------------------------------
        addKeyListener(new KeyListener() {
            
            public void keyTyped(KeyEvent e) {
                               
            }
            
            public void keyPressed(KeyEvent e) {
                switch(e.getExtendedKeyCode())
                {
                    case KeyEvent.VK_C:
                        graph.clear();
                        graph.repaint();
                        break;
                        
                    case KeyEvent.VK_RIGHT:
                        graph.moveright();
                        graph.repaint();
                        break;
                }                
            }
            
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) 
    {
        new GrepherView();        
    }
    
}
