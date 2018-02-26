package concurrent_assignment1.D;

import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Hurry must:
 * - Be the main thread
 * - Create the Lazy thread.
 * - Wait for Lazy to finish. Each second it must print the message: “Aren’t you ready yet?” and checks if Lazy is finished.
 * - If Lazy isn’t finished after 5 seconds, Hurry will claim “You are resting in your laurels… and I am leaving!” and interrupts Lazy. Then it waits for Lazy to finish.
 * - However, if Lazy finishes before the 5 seconds deadline, Hurry says “At last, a turtle runs rings round you!”.
 * 
 * @author yournamehere
 *
 */


public class Hurry {
    
    public static void main(String args[]){
    
   
   java.util.Random rand =new java.util.Random();
   int j=0;
   Lazy t = new Lazy(); 
   t.start();
   
   for(int i=1;i<=5;i++)
   {
       if(!t.isAlive()) //isAlive return true if the thread is running.
           break;
       else{
           try {
               System.out.println("Aren't you ready yet?\n ");
               Thread.sleep(1000);
           } catch (InterruptedException ex) {
               Logger.getLogger(Hurry.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       if(t.isAlive() && i==5)
       {
           System.out.println("You are resting in your laurels... and I am leaving! \n");
           t.interrupt();
       }
       else 
           System.out.println("At last, a turtle runs rings round you\n");
   }
   
    }
}
