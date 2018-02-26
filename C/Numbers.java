package concurrent_assignment1.C;

/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author yournamehere
 *
 */

public class Numbers {
    
    public static void main(String args[])
    {
        R_PrintID t1= new R_PrintID(1);
        t1.run();
        R_PrintID t2= new R_PrintID(2);
        t2.run();
        R_PrintID t3= new R_PrintID(3);
        t3.run();
        R_PrintID t4= new R_PrintID(4);
        t4.run();
        R_PrintID t5= new R_PrintID(5);
        t5.run();
    }

}

