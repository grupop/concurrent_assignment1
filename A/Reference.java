package concurrent_assignment1.A;

/**
 * Get the reference of the main thread    */

public class Reference {

     public static void main(String[] args) throws InterruptedException {
    
    //Thread h= Thread.currentThread();
        
        for(int i=1;i<=50;i++)
        {
            Thread.sleep(2000); //sleep the process for two second this method is static
            System.out.println("I am the thread number: " + i);
            
            //Refenrece
        }
    }
}
