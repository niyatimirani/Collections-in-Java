package Introduction;

public class ThreadLifeCycle extends Thread{

	@Override
	public void run() {
		
		System.out.println("Running");
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.print(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ThreadLifeCycle t1 = new ThreadLifeCycle();
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		Thread.sleep(5000);
		System.out.println(t1.getState());
		t1.join();
		System.out.println(t1.getState());
		

	}

}
