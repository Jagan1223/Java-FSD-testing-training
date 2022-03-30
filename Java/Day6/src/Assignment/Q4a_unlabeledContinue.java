//Unlabeled continue
package Assignment;

public class Q4a_unlabeledContinue {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==4)
					continue ;  
				if(j==4)
					continue ; 
				System.out.print(j+ " ");	
			}
			System.out.println();
		}
	
	System.out.println("out of outer loop");
	}
}
