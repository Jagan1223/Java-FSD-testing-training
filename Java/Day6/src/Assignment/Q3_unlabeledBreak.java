package Assignment;

public class Q3_unlabeledBreak {

	public static void main(String[] args) {
		for (int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==4)
					break;  //breaks when i=4 and goes to first for-loop
				System.out.print(i+ " ");				
			}
		System.out.println();
		}
	}

}
