package Programs;
import java.util.Scanner;


interface vehicleone{
int speed=90;
public void distance();
}

interface vehicletwo{
int distance=100;
public void speed();
}
public class multipleinheritance implements vehicleone,vehicletwo{
	public void distance()
	{
		int distance=speed*100;
		System.out.println("distance travelled is "+distance);
	}
	public void speed(){
		int speed=distance/100;
		System.out.println("distance travelled is "+speed);
		}
}
class MultipleInheritanceUsingInterface
{
		public static void main(String[] args)
		{
		 System.out.println("Vehicle");
		 multipleinheritance obj = new multipleinheritance();
		 obj.distance();
		 obj.speed();
		
		}
}