package Assignment;

import java.util.Scanner;

public class Q5_Array {

	public static void main(String[] args) {
		System.out.println("enter the number of Employees");
		Scanner sc=new Scanner(System.in);
		int employeeno=sc.nextInt();
		System.out.println("enter the name of the Employee followed by their Salary and year of joining");
		String[] names=new String[employeeno];
		double[] salary=new double[employeeno];
		int[] year=new int[employeeno];
		for(int i=0;i<employeeno;i++)
		{
			names[i]=sc.next();
			salary[i]=sc.nextDouble();
			year[i]=sc.nextInt();
		}
		for(int i=0;i<employeeno;i++)
		{
			System.out.println("Employee Name = "+names[i]	);
			System.out.println("Salary = "+salary[i]);
	    	System.out.println("Year = "+year[i]);
	    	System.out.println("****************");
		}
	}

}
