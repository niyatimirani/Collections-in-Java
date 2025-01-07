package List;
import java.util.*;
public class ArrayListTutorial {
	
   public static void main(String args[])
   {
	   ArrayList<Integer> a1 = new ArrayList<>();
	   Scanner sc = new Scanner(System.in);
	   for(int i=0 ; i<5 ; i++)
	   {
		   int k = sc.nextInt();
		   a1.add(k);
	   }
	   System.out.print(a1);
   }
}




