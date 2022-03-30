package Array;

import java.util.Scanner;

public class TwoArray3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and column of an array");
		int row = sc.nextInt();
		int column = sc.nextInt();
		String[][] arr1 = new String[row][column];
		System.out.println("Enter the string values");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr1[i][j] = sc.next();
			}
		}
		System.out.println("The String vales of the array are:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr1[i][j]+" , ");
			}
			System.out.println("");
		}
		

	}

}
