 package Programs;

import java.util.*;

public class A3_NoOfSquares {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value N");
		n = sc.nextInt();
		if(n<=0)
		{
			System.out.print("Invalid Input");
		}
		else
		{
			int sum = 0;
			int i = 1;
			while(n>0)
			{
				sum =sum + n*n;
				int temp = n*n;
				System.out.print("Number of matrix for "+ i+ '*' +i);
				System.out.println(" Matrix are " + n*n);
				n--;
				i++;
			}
			System.out.println("The number of total matrix are " + sum);
		}
}
}