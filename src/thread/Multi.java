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
class Multi extends Thread {

    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        Multi t1 = new Multi();
        t1.start();
    }
}
