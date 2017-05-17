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
class Multi3 implements Runnable {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        Multi3 m1 = new Multi3();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
