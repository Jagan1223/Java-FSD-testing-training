//2.Create an arraylist of integers and find the sum and average of the entire list.

package Assignment;

import java.util.ArrayList;
import java.util.List;

public class Q2_ArrayList {

	public static void main(String[] args) {
		  List<Integer> list=new ArrayList<Integer>();  
		  list.add(21);  
		  list.add(11);  
		  list.add(51);  
		  list.add(1); 
		  int sum=0;
		  for(int i:list)
			  sum=sum+i;
		  System.out.println("Sum = "+sum);
		  int avg=sum/list.size();
		  System.out.println("Average = "+avg);
	}

}
