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
class TestCallRun1 extends Thread {

    public void run() {
        System.out.println("running...");
    }

    public static void main(String args[]) {
        TestCallRun1 t1 = new TestCallRun1();
        t1.run();//fine, but does not start a separate call stack  
    }
}
