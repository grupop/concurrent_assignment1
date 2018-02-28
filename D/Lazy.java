package concurrent_assignment1.D;

import java.util.logging.Level;
import java.util.logging.Logger;

/** Lazy must:
 * - Extend Thread
 * - Enter in a loop which iterates a random number of times between 2 to 8.
 * - Sleep 1 second
 * - At each iteration, it displays a random message among: “I am dressing up…”, “Just a sec, please…”, or “These clothes do not suit me…”.
 * - If Hurry interrupts Lazy before it is finished, Lazy claims: “That’s not cricket, please play the game!”.
 * - If Lazy finishes before being interrupted, it says “I am ready, the early bird catches the worm!”.
 * 
 * @author yournamehere
 *
 */

public class Lazy extends Thread{
    
    java.util.Random rand = new java.util.Random();
    
    //This method generate the random numbers  of times between 2 to 8
    public int r(){
        return (rand.nextInt(7)+2);
    }
    
    //Here we defining run method, employing random method
   
    public void run(){
        int i=0;
        int random=this.r();
        
        do{
            
                if(this.isInterrupted())
                    break;
                int a= rand.nextInt(2);
               
                //At each iteration, it displays a random message among: 
             
                switch (a){
                    case 0:
                        
                        System.out.println("I am dressing up...\n");
                        break;
                    case 1:
                        
                        System.out.println("Just a sec, please\n");
                        break;
                    case 2:
                        System.out.println("These clothes do not suit me...\n");
                        break;
                        
                }
                try {
                Thread.sleep(1000);
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Lazy.class.getName()).log(Level.SEVERE, null, ex);
            }
            i++;
        }while(i<random);
        
        //If Lazy finishes before being interrupted, it says 
        if(i==random && !this.isInterrupted())
            System.out.println("I am ready, the early bird catches the worm\n");
        else
         //If Hurry interrupts Lazy before it is finished, Lazy claims: 
            System.out.println("That's not cricket, please play the game!\n");
    }

}
