package com.github.giovaneneves7.splashscreenstudy.view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/**
 *
 * @author Giovane Neves
 */
public class SplashScreen {
  
    final JWindow window;
    long milliseconds;
    
    public SplashScreen(long milliseconds, String imagePath){
        
        window = new JWindow();
        this.milliseconds = milliseconds;
        
        window.getContentPane()
                .add(new JLabel(new ImageIcon(getClass().getResource(imagePath))));
        
    }
    
    public void setBounds(int x, int y, int width, int height){
        
        this.window.setBounds(x, y, width, height);
        
    }  
    
    public void setVisible(boolean value){
        
        this.window.setVisible(value);
        
    }
        
    public void setVisibleTime(){
        
        try{
            Thread.sleep(this.milliseconds);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
        
        this.setVisible(false);
        
    }
    
    public void dispose(){
        
        this.window.dispose();
        
    }
    
}
