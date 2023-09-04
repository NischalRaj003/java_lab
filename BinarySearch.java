package Programs;
import java.util.*;
public class BinarySearch {
	public int search(int[] array,int s,int var)
	{
		int low=0,high=s-1,mid;
		while(low<=high)
		{
			mid=(low+high)/2;
			if(array[mid]==var)
			{
				return mid;
			}
			else if(array[mid]>var)
				high=mid-1;
			else
				low=mid+1;
		}
		return 0;
	}

	public static void main(String[] args) {
		int size,key,iter,res;
		Scanner obj=new Scanner(System.in);
		System.out.print("\nEnter the size of the array:");
		size=obj.nextInt();
		
		int array[]=new int[size];
		System.out.println("\nEnter the elements of the array:");
		for(iter=0;iter<size;iter++)
		{
			array[iter]=obj.nextInt();
		}
		System.out.println(array);
		int temp;                                      //To sort the array
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(array[j]>=array[j+1])
				{
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("Sorted array is:");
		for(iter=0;iter<size;iter++)
		{
			System.out.print(array[iter]+"\t");
		}
		
		System.out.println("\nEnter the element to be searched:");
		key=obj.nextInt();
		
		BinarySearch bin=new BinarySearch();
		res=bin.search(array,size,key);
		
		if(res==0)
			System.out.println("Element not found");
			
		else
			System.out.println("Element is found at position "+(res+1));
	}


}
