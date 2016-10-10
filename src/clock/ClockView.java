/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import javax.swing.JFrame;

/**
 *
 * @author Daniel
 */
public class ClockView extends JFrame{
    public ClockView()
    {
        super("Clock");
        setSize(300,300);
        widgets();
        events();
        setVisible(true);
    }
    //----------------------------------------------------------------------
    private void widgets()
    {
        add(new Clock());
    }
    //---------------------------------------------------------------
    private void events()
    {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    //-------------------------------------------------------------------
    public static void main(String[] args) {
        new ClockView();
    }
 
         
    
}
