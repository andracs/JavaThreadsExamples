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
class TestMultiPriority1 extends Thread {

    public void run() {
        System.out.println("running thread name is:" + Thread.currentThread().getName());
        System.out.println("running thread priority is:" + Thread.currentThread().getPriority());

    }

    public static void main(String args[]) {
        TestMultiPriority1 m1 = new TestMultiPriority1();
        TestMultiPriority1 m2 = new TestMultiPriority1();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();

    }
}
