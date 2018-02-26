package concurrent_assignment1.B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5) and runs them.
 * Can you detect some problem? Can you explain the reason?
 * 
 * @author yournamehere
 *
 */

public class Numbers extends Thread{
    
    public static void main(String args[])
    {
        T_PrintID t1= new T_PrintID(1);
        t1.start();
        T_PrintID t2= new T_PrintID(2);
        t2.start();
        T_PrintID t3= new T_PrintID(3);
        t3.start();
        T_PrintID t4= new T_PrintID(4);
        t4.start();
        T_PrintID t5= new T_PrintID(5);
        t5.start();
    }
}
