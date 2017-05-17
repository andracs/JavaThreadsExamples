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
public class ThreadGroupDemo implements Runnable{  
    public void run() {  
          System.out.println(Thread.currentThread().getName());  
    }  
   public static void main(String[] args) {  
      ThreadGroupDemo runnable = new ThreadGroupDemo();  
          ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup");  
            
          Thread t1 = new Thread(tg1, runnable,"one");  
          t1.start();  
          Thread t2 = new Thread(tg1, runnable,"two");  
          t2.start();  
          Thread t3 = new Thread(tg1, runnable,"three");  
          t3.start();  
               
          System.out.println("Thread Group Name: "+tg1.getName());  
         tg1.list();  
  
    }  
   }  