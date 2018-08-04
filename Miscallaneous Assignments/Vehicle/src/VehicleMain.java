import java.util.Scanner;

public class VehicleMain 
{

	public static void main(String args[])
	{
		int ch;										//taking  a variable
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the owner name ");
		String ownername=sc.next();
		Vehicle v=new Vehicle(ownername);				//Creating an object for vehicle
		
		System.out.println("Enter the highest vehicle identification number");
		v.setHighestvehicleidentificationnumber(sc.nextInt());
		
		System.out.println("Enter the vehicle identification number");
		v.setVehicleID(sc.nextInt());
		
		
		do
		{
			
		System.out.println("Press\n1 Change Speed .\n2 Degree Turn. \n3 Direction Turn. \n4 Stop");
		System.out.print("Enter your choice");
		ch=sc.nextInt();
		
		switch(ch) {					//applying switch case
		case 1:
			System.out.println("Enter Speed");
			v.changeSpeed(sc.nextDouble());
			break;
			
			case 2:
			System.out.println("Enter Direction(left/right)");
			String dir=sc.next();
			System.out.println("Enter Degrees");
			double degrees=sc.nextDouble();
			
			v.turn(degrees,dir);				//calling the function turn with the help of the object 
			break;
			
			case 3:
				System.out.println("Enter Direction(left/right)");
				dir=sc.next();
			
			
			v.turndirection(dir);
				
			case 4:
				v.stop();
				break;
				
				default:
					System.out.println("Wrong Option Chosen");
		}
		}	while(ch!=4);
		
		
	}
}
