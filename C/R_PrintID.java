package concurrent_assignment1.C;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author yournamehere
 *
 */

//Here implements interface Runneable -->  because we modificated method run, 
                                         //and this interfaz have yet the capacity to create other thread

public class R_PrintID implements Runnable{
    
    //Declare random variable to identify each thread 
    
    java.util.Random rand = new java.util.Random();
    int ID;

    //This is a constructor, he assign one pharmaters whith our id declare
    public R_PrintID(int ID){
        this.ID=ID;
    }
    
    
    /*
     * In this case we do the method run, implementing the runneable interface and defining the run function  of this interface.
      - The loop sleeps the thread a random time between 0 and 1
      -For it, we use the method sleep to sleep a thread for the specified amount of time
      -If you sleep a thread for the specified time,another thread is exejute and so on.
      -A Logger object is used to log messages for a specific system or application component.
   
   */
    @Override
    public void run() {
        for (int i=1;i<=10;i++)
        {
            System.out.println("ID: " + i );
            try {
                Thread.sleep(rand.nextInt(1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(R_PrintID.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

