package com.github.giovaneneves7.splashscreenstudy;

import com.github.giovaneneves7.splashscreenstudy.view.SplashScreen;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Giovane Neves
 */
public class SplashScreenStudy {

    public static void main(String[] args) {
        
        SplashScreen splashScreen = new SplashScreen(6000, "/assets/images/BIOSIMULE.png");
        
        splashScreen.setBounds(500, SwingConstants.CENTER, 500, 500);
        splashScreen.setVisible(true);
        splashScreen.setVisibleTime();
        
        JFrame frame = new JFrame();
        frame.setBounds(500, SwingConstants.CENTER, 500, 500);
        
        JLabel welcomeLabel = new JLabel("Welcome To The Application", SwingConstants.CENTER);
        welcomeLabel.setForeground(Color.white);
        
        JButton closeButton = new JButton("X");
        closeButton.addActionListener(evt -> {
            System.exit(0);
        });
        closeButton.setBackground(Color.red);
        closeButton.setForeground(Color.white);
        closeButton.setBounds(SwingConstants.RIGHT, SwingConstants.CENTER, 100, 30);
        
        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBounds(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
        backgroundPanel.setBackground(Color.GRAY);
        backgroundPanel.add(welcomeLabel);
        backgroundPanel.add(closeButton);
        
        frame.add(backgroundPanel);
        frame.setTitle("Welcome");
        frame.setLayout(null);
        frame.setVisible(true);
        
        splashScreen.dispose();
    }
}
