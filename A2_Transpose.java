package Programs;
import java.util.*;

public class A2_Transpose {
	public void override()
	{
		System.out.println("To find transpose of a matrix");  //Transpose
		int m,n,i,j;
		Scanner scan=new Scanner(System.in);
		System.out.print("\nEnter the rows of the matrix:");
		m=scan.nextInt();
		System.out.print("\nEnter the columns of the matrix:");
		n=scan.nextInt();
		
		int matrix[][]=new int[m][n];
		
		System.out.println("Enter the matrix elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				matrix[i][j]=scan.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("The transpose of the matrix is:");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.print("\n");
		}
	}

}

class Evenodd_matrix extends A2_Transpose
{
	
	public void override()
	{
		super.override();
		int size;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nTo separate even and odd elements");               //Even and odd elements array
		System.out.print("Enter the size of the array:");
		size=scan.nextInt();
		
		int array[]=new int[size];
		System.out.println("Enter the "+size+" elements:");
		for(int i =0;i<size;i++)
		{
			array[i]=scan.nextInt();
		}
		
		int even[]=new int[size];
		int odd[]=new int[size];
		int iter,e=-1,o=-1,l=0,m=0;
		int i;
		for(i=0;i<size;i++)                      //For separating odd and even elements
		{
			if(array[i]%2==0)
			{
				e=e+1;//Index value
				l=l+1;//No of even no
				even[e]=array[i];
			}
			else
			{
				o=o+1;
				m=m+1;
				odd[o]=array[i];
			}
			
		}
		
		System.out.println("Even elements matrix is:");  //Printing Even elements matrix
		for(i=0;i<l;i++)
		{
			System.out.print(even[i]+"\t");
		}
		
		System.out.println("\nOdd elements matrix is:"); //Printing Odd elements matrix
		for(i=0;i<m;i++)
		{
			System.out.print(odd[i]+"\t");
		}
		scan.close();
	}

	public static void main(String[] args) 
	{
		
		Evenodd_matrix obj=new Evenodd_matrix();
		obj.override();

	}

}
