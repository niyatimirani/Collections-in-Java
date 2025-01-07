package Introduction;

public class ThreadMethods extends Thread{

	@Override
	public void run() 
	{
		
		System.out.println("Thread is running");
		System.out.println("Running");
		for(int i=0 ; i<=3 ; i++) 
		{
			System.out.println(i +" "+ Thread.currentThread().getName());
		try {
			Thread.sleep(5000);
			
		}
		catch(InterruptedException e)
		{
			System.out.print(e);
		}
		
	}
}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadMethods t1 = new ThreadMethods();
		ThreadMethods t2 = new ThreadMethods();
		ThreadMethods t3 = new ThreadMethods();
		t1.setDaemon(true); // background thread jvm doesn't wait for
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		Thread.yield(); // give chance to other thread
		
		
		System.out.println("Hello Main done");

	}

}
