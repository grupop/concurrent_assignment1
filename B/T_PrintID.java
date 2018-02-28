package concurrent_assignment1.B;

/**
 * Create class T_PrintID which extends Thread:
 *	- It must contain a variable ID whose value is first set through the class constructor.
 *	- Method run() has a loop which iterates 10 times displaying ID.
 *
 * @author yournamehere
 */
public class T_PrintID  extends Thread{
    
    //Declare the id of the thread
    
    int ID;

    
    /*
    This is a constructor, he is a method called automatically when we create an object of this class
 
    We create an object  of T_print type and the value of variable ID be the value passed as parameter
    */
    
    public T_PrintID(int ID){
        this.ID=ID;
    }
    
    
    
    
    /*
         
    -METHOD RUN: (is a method derivated of a thread class) he throw process 
   
    -In this method is where the subprocess action takes place   
    -We are redefining the run method     
    -We employ a loop what will he go  form 1 to 10 for print, that is to say,  a loop which iterates 10 times displaying ID
    
    */
    
    @Override
    public void run() {

        for (int i=1;i<=10;i++)
        {
            System.out.println("ID: " + i );
        }
    }
    

}