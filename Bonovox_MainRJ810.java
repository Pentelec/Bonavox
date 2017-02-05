import java.lang.*;
import javax.swing.*;
import java.awt.*;

public class Bonovox_MainRJ810 {

  int randomInt;

  public Bonovox_RJ810(int a) {
    randomInt=a;
  }
  
  public static void main(String[] args) {
    Bonovox_RJ810 an1 = new Bonovox_RJ810(10);
    String a = JOptionPane.showInputDialog(null, "To test the program and/or your speakers, type in: Test It!");
    if (a.equals("Test It!")) {
     Toolkit.getDefaultToolkit().beep(); 
    }
  }

} // Always note where the end is. If Jack loses his ball past this, we get a EOFException for the ball. A BALL. JACK'S BALL. IS THAT WHAT YOU WANT?