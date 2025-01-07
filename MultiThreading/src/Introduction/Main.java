package Introduction;

public class Main {

	public static void main(String[] args) {
		
		World obj = new World(); 
		
		
         obj.start();//start method is called to iniate the new thread
		
		Thread t1 = new Thread(obj);
		t1.start();
		for(int i=0 ; i<100 ; i++)
		{
			System.out.println("Main " + i);
		}

	}

}
