// Todd J Myers
// 07/18/20
// Threads project 9 


package threads;


import java.util.ArrayList; 
import java.util.Iterator;
 import java.util.List;

public class Driver
{

	public void run() {} 
	
public static void main(String[] args) throws Exception 
{
        
        OrderQueue orders = new OrderQueue();
        
        List<Thread> threadList = new ArrayList<Thread>();
        
        Thread tm = new Thread(new TaskMaster(orders));
        Thread w1 = new Thread(new Worker(orders, 1));
        Thread w2 = new Thread(new Worker(orders, 2));
        Thread w3 = new Thread(new Worker(orders, 3));
        
        threadList.add(tm);       
        threadList.add(w1);    
        threadList.add(w2);      
        threadList.add(w3);               
        tm.setPriority(Thread.MAX_PRIORITY); 
        
        tm.start();
        w1.start();
        w2.start();
        w3.start();
        
        Iterator<Thread> i= threadList.iterator();    
        
        while(i.hasNext()) {          
        	((Thread) i.next()).join();     
        	
        	} 
        
        System.out.println("Finished?");
    }
}
