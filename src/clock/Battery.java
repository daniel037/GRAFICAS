/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author oop
 */
public class Battery extends Thread{
    
    private Clock c;
    
    //--------------------------------------------------------
    public Battery(Clock c)
    {
        this.c =c;
    }
    //---------------------------------
    public void run()
    {
        while(true)
        {
            try
            {
                c.repaint();
                sleep(1000);
            } catch (InterruptedException ex) {             
            }
        }
    }
}
