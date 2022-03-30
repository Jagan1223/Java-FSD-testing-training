//labeled Continue
package Assignment;

public class Q4b_labeledContinue {

	public static void main(String[] args) {
		loop1:
			for (int i=1;i<=5;i++)
			{
				loop2:
				for(int j=1;j<=i;j++)
				{
					//if(i==4)
						//continue loop1;  
					//if(j==4)
						//continue loop2; 
					System.out.print(j+ " ");	
				}
				System.out.println();
			}
		
		System.out.println("out of outer loop");

	}

}
