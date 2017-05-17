/*
 *  Developed by András Ács (acsandras@gmail.com)
 *  Ej hvor er jeg glad for mine studerende!
 *  Erhvervsakademi Sjælland / www.easj.dk
 *  Licensed under the MIT License 
 *  16/05/2017
 *
 */
package thread;

import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author andrasacs
 */
class ThreadRunner extends Thread {


    int milliSec;
    String name;

    ThreadRunner(int milliSec, String name) {
        this.milliSec = milliSec;
        this.name = name; 
    }
    

    
    
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Bip " + name + " " + i);
              Toolkit.getDefaultToolkit().beep();
//                SoundUtils.tone(200,500);
//            } catch (LineUnavailableException ex) {
//                Logger.getLogger(ThreadRunner.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            try {
//                Thread.sleep(milliSec);
//
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            } 
        }
    }

}

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadRunner t1 = new ThreadRunner(2000, "A");
        t1.start();
         ThreadRunner t2 = new ThreadRunner(500, "B");
        t2.start();
    }

    public App() {
    }

}
