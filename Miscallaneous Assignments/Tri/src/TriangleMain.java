
public class TriangleMain { 	//Main

	public static void main(String args[])
	{
		Triangle t=new Triangle(10,10,10);
		System.out.println("IsRight"  + t.IsRight());
		System.out.println("IsScalene"  + t.IsScalene());
		System.out.println("IsIsosceles"  + t.IsIsosceles());
		System.out.println("IsEquilateral"  + t.IsEquilateral());
	}
}
