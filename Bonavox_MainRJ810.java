/**
 * A temporary main screen for the Bonavox GUI.
 *
 * @author Robert J. Altman <pentelec@aim.com>
 *
 * @author Mateusz Ryczek <matthewryczek@rocketmail.com>
 * 
 * @version 0.0.7 (RJ-8122012)
 * 
 * @since 2012-08-10
 * 
 */

import java.lang.*;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.lang.String;
import java.applet.*;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import sun.audio.*;
import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

/* READ THIS!!!!!!
 * 
 * There are currently 2 errors at time of compile dealing with Speech or something.
 * If you could fix this I would be thankful.
 * 
 * Also, you will note that I comment a lot of stuff out...sometimes.
 * 
 * Many thanks,
 * 
 * A tired programmer (Robert)
 * 
 * P.S. BTW IAN, WHY DON'T YOU DO SOME BLACK-BOX CODING SOMETIME?!?
 * jk. k thnx baii
 * 
 * By the way, never comment out like that.
 * Over and out.
 */


public class Bonavox_MainRJ810 extends Speech implements ActionListener { // Figured out implements ActionListener from a code Kristian Koves made a long time ago. (It's why he's up there)

  
  int randomInt; // As stated, a random int. It's funny 'cause we don't use it.

  public Bonavox_MainRJ810() {
    super(); // Constructor calls on the constructor from Speech, but doesn't really matter. After all, randomInt is totally useless.
    // If you want, you can get rid of the variable (if you know a work-around).
  }
  
  public void actionPerformed (ActionEvent e) 
  {
    System.out.println("Get dog hair off");
  }
  
  public static void main(String[] args) {
    Bonavox_MainRJ810 an = new Bonavox_MainRJ810(); // Creates an instance of the program.
    
    JFrame jf = new JFrame("Bonavox Start"); // Makes an invisible JFrame with the title, well, you can read.
      jf.setEnabled(true); // Enable this stuff. It's good. 
      jf.setSize(800,600); // General size. I still have a computer with that as it's resolution (RJ).
      jf.setVisible(true); // The other...enabler...kinda. As this implies, you can now see the form.
      jf.getContentPane().setBackground(Color.BLACK); //Sets a black bgcolor. 
    
    JLabel label = new JLabel(); //Makes a JLabel.
    String path = "lgt.png"; // Makes a string pointing to the image in its name. Useless unless called (watch, it is).
    
    try { // Like VB "Try" & "Catch ex as Exception".
      
      File imageFile = new File( path ); // Find a file with the path specified above.
      BufferedImage image = ImageIO.read( imageFile ); // Read the file as an image.
      label = new JLabel(new ImageIcon(image)); // Set the label's image to the image specified above.
        label.setPreferredSize(new Dimension(800,600)); // Make the image 800x600. This also makes the form 800x600 (redundant, I know).
        jf.getContentPane().add(label); // Add the label so it is visible on the JFrame.
        jf.setLocationRelativeTo(null); // Honestly, I forgot what this does. Someone review PLEASE. (RJ)
        jf.pack(); // Compacts all items to size all nicely. Resizes JFrame too.
        
      JButton jbA = new JButton(); // Make a new button.
        jbA.setText("Try some Sounds..."); // Set text for this button we created.
        jbA.setLocation(jf.getWidth()/2,jf.getHeight()/2); // Deprecated...but hey it works with two ways so leave it.
        int startOfBttnX = (int) jf.getWidth()/3; // X Location Start determined here. Casting used (int/double interference).
        int startOfBttnY = (int) (jf.getWidth()/4)*2; // Y Location Start determined here. Casting used (int/double interference).
        jbA.setBounds(startOfBttnX, startOfBttnY, 250, 30); // Set button location using the variables above with a button size of 250x30.
        jf.getContentPane().add(jbA); // Add the button to the JFrame.
        jf.setLayout(null); // Reset Layout...I think...? (RJ)
        jf.pack(); // Compacts all items to size all nicely, as said earlier. It will compact at first but don't get scared.
        jf.setSize(800,600); // Resize to show logo as well.
        jbA.addActionListener(an); // ActionListener added to the instance of the program created.
        
    } catch(Exception e){} // Catch exceptions before they screw up the program.
    
  }

} // Always note where the end is. If Jack loses his ball past this, we get a EOFException for the ball. A BALL. JACK'S BALL. IS THAT WHAT YOU WANT?