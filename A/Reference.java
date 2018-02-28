package concurrent_assignment1.A;

/**
 * Get the reference of the main thread 
 
A sequential program has one single thread called the main thread. We can capture this thread by
using a static method of class Thread:


Thread h = Thread.currentThread ();
 
 keeping the reference to the main thread, we can use public methods of class Thread on it:
- Write a sequential program which prints the first 50 odd numbers.
- Catch the main thread and print its name, then change that name and display it next to
each odd number, making the thread sleep for 2 seconds at each iteration.
 
 
 
 */



public class Reference {

     public static void main(String[] args) throws InterruptedException {
    
    //Thread h= Thread.currentThread(); It is not necesary, because class Thread include the creation of a thread
    //This is a iteration where writes the numbers, in this case print 1-50
        for(int i=1;i<=50;i++)
        {                        //Call the class thread, she will take care of it to create a thread 
            Thread.sleep(2000); //sleep the process for two second this method is static
            System.out.println("I am the thread number: " + i); //Print the number 
            
    //Method static: he can be accessded whitout  needed to instance of one object
        }
    }
}
