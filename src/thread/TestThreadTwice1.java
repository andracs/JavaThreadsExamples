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
public class TestThreadTwice1 extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();
        t1.start(); // Throws exceprtion: You shall not start a thread twice!
    }
}
