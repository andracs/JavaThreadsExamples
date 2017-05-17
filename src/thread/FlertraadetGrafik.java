/*
 *  Developed by András Ács (acsandras@gmail.com)
 *  Ej hvor er jeg glad for mine studerende!
 *  Erhvervsakademi Sjælland / www.easj.dk
 *  Licensed under the MIT License 
 *  17/05/2017
 *
 */
package thread;

/**
 *
 * @author andrasacs
 */
import java.awt.*;
import javax.swing.*;

public class FlertraadetGrafik
{
  public static void main(String[] arg)
  {
    JFrame f = new JFrame();
    f.setSize(400,150);
    f.setBackground(Color.WHITE);
    f.setVisible(true);
    Graphics g = f.getGraphics();
    new Bold(g,  0, 0);
    new Bold(g, 50,10);
    new Bold(g,100,50);
    new Bold(g,150,90);
  }
}

