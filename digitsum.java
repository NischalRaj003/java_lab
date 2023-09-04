package Programs;
import java.util.*;
public class digitsum {
	public void sum(int n)
	{
		int temp=n,digsum,rem;
		while(temp>10)
		{
			System.out.println("\nTaking input as "+temp+"\nAfter addition of the digits:");
			rem=temp%10;
			temp=temp/10;
			digsum=rem+temp;
			if(digsum<10)
			{
				System.out.println(digsum+" is less than 10");
			}
			else
			{
				System.out.println(digsum+" is greater than 10");
			}
			temp=digsum;
		}
	}

	public static void main(String[] args) {
		int  number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two digit number:");
		number=scan.nextInt();
		
		digitsum obj=new digitsum();
		obj.sum(number);

	}

}
