package phase1;

public class Thread extends java.lang.Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		Thread mt = new  Thread();
  		mt.start();
 	}
}
