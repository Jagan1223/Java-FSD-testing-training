package Assignment;

import java.util.Scanner;

public class Q1_java {

	public static void main(String[] args) {
		try {
			try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter values");
				int num1 = sc.nextInt();
				int num2 = Integer.parseInt(sc.next());
				int result = num1 / num2;
				System.out.println(result);
			} 
			catch (NumberFormatException e) {
				System.out.println(e);
			}
			String a = null;
			System.out.println(a.length());
		} 
		catch (NullPointerException e) {
			System.out.println(e);
		}
	}
}