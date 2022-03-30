package Assignment;

public class Q3b_labeledBreak {
	
	public static void main(String[] args) {
		loop1:
		for (int i=1;i<=5;i++)
		{
			loop2:
			for(int j=1;j<=i;j++)
			{				
				if(j==4)
					break loop2;
				if(i==5)
					break loop1;
				System.out.print(j+ " ");				
			}
		System.out.println();
		}
		System.out.println("Out of the loop");
	}
}
