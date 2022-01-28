package phase1;

public class Sleep {
	
	    private static Object LOCK = new Object();
	    public static void main(String args[]) throws InterruptedException
	    {
	        Thread.sleep(2000);
	        System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 5 second");
	        synchronized (LOCK) 
	        {
	            LOCK.wait(2000);
	            System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 5 second");
	        }
	    }
}