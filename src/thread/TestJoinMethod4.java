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
class TestJoinMethod4 extends Thread {  
 public void run(){  
  System.out.println(Thread.currentThread().getName());  
 }  
 
 public static void main(String args[]){  
  TestJoinMethod4 t1=new TestJoinMethod4();  
  TestJoinMethod4 t2=new TestJoinMethod4();  
  
  t1.start();  
  t2.start();  
 }  
}  