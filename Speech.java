/**
 * A speech class started by Altman and McCann 8112012.
 *
 * @author Robert J. Altman <pentelec@aim.com>
 * 
 * @author Ian M. McCann <eman2129@gmail.com>
 *
 * @version 0.0.1 (IMM-8112012)
 * 
 * @since 2012-08-11
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

public class Speech {
  public enum VoiceSex { MASCULINE, NEUTER, FEMININE, OWNVOICE}
  
  private AudioClip snd;
  private URL path;
  private static final int EXTERNAL_BUFFER_SIZE = 128000;
  
  public Speech() {
    
  }
  
  public void say(){
    Scanner in = new Scanner(System.in);
    System.out.print("Enter sound:");
    String sound = in.nextLine();
    if (sound.equals("u")){
      playSound("NCNBV_not_YMCMB_otraref.wav");
  }
    else if (sound.equals("a")){
      playSound("Open_Frnt_UnR_V.wav");
    }
    else {
      System.out.println("'" + sound + "' is not a valid sound.");
    }
  }
  
  public void uConA() {
      playSound("Open_Frnt_UnR_V.wav");
      playSound("NCNBV_not_YMCMB_otraref.wav");
  }
  
  public void playSound(String fn) {
  String strFilename = fn;
  File soundFile = new File(fn);
  AudioInputStream audioInputStream = null;
  try
  {
   audioInputStream = AudioSystem.getAudioInputStream(soundFile);
  }
  catch (Exception e)
  {
   e.printStackTrace();
   System.exit(1);
  }
  AudioFormat audioFormat = audioInputStream.getFormat();
  SourceDataLine line = null;
  DataLine.Info info = new DataLine.Info(SourceDataLine.class,
             audioFormat);
  try
  {
   line = (SourceDataLine) AudioSystem.getLine(info);
   line.open(audioFormat);
  }
  catch (LineUnavailableException e)
  {
   e.printStackTrace();
   System.exit(1);
  }
  catch (Exception e)
  {
   e.printStackTrace();
   System.exit(1);
  }
  line.start();
  int nBytesRead = 0;
  byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
  while (nBytesRead != -1)
  {
   try
   {
    nBytesRead = audioInputStream.read(abData, 0, abData.length);
   }
   catch (IOException e)
   {
    e.printStackTrace();
   }
   if (nBytesRead >= 0)
   {
    int nBytesWritten = line.write(abData, 0, nBytesRead);
   }
  }
  line.drain();
  line.close();
    }
     
  public static void main(String[] args) {
    Speech an = new Speech();
    an.uConA();
  }
  
} // Always note where the end is. If Jack loses his ball past this, we get a EOFException for the ball. A BALL. JACK'S BALL. IS THAT WHAT YOU WANT?