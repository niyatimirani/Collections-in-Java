package Introduction;

public class World  extends Thread{

	
	public void run() // the run method is overridden
	//to define the code that constitutes the new thread 
	{
		for(int i=0 ; i<100 ; i++)
		{
			System.out.println("Hello User" + i);
		}
	}


}
