package Introduction;

public class MyThreads extends Thread {

   private Counter counter;
   public MyThreads(Counter counter)
   {
	   this.counter = counter;
   }

   /**
 *
 */
public void run()
   {
	   for(int i= 0 ; i<100 ; i++)
	   {
		   counter.increment();
	   }
   }
   public static void main(String args[])
   {
	   Counter counter = new Counter(); // common resource
	   MyThreads t1 = new MyThreads(counter);
	   MyThreads t2 = new MyThreads(counter);
	   MyThreads t3 = new MyThreads(counter);
	   t1.start();
	   t2.start();
	   t3.start();
	   
	   try {
		   t1.join(); // waiting to join all threads
		   t2.join();
		   t3.join();
	   }catch(Exception e)
	   {
		   System.out.print(e);
	   }
	   
	   
	   System.out.print(counter.getCount());
	   
	   
   }
   
}
