package threads;

import java.util.ArrayDeque;
import java.util.Queue;

public class OrderQueue 
{
	 private Queue<Object> orders;
	    private boolean moreOrdersComing;
	    
	    public OrderQueue()
	    {
	        orders = new ArrayDeque<>();
	        moreOrdersComing = true;
	    }
	    
	    synchronized public void createTask(String label, int timeToComplete)
	    {
	        orders.offer(new Task(label, timeToComplete));
	       
	    }
	    
	    public Task acceptTask() 
	    {
	        while (orders.isEmpty()) {
	            // looping until there is a task in the queue to accept
	        	try{wait();}catch(Exception e){}
	        }
	        return (Task) orders.poll();
	    }
	    
	    public void setNoMoreOrders()
{
	        moreOrdersComing = false;
	    }
	    
	    public boolean weAreDone() 
	    {
	        return orders.isEmpty() && !moreOrdersComing;
	    }
	
}