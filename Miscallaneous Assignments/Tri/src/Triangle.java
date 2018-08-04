
public class Triangle {
double side1,side2,side3; //Instance variables

public Triangle(double side1,double side2,double side3)		//Parameterised Constructor
{
	this.side1=side1;
	this.side2=side2;
	this.side3=side3;
}
public boolean IsRight() 	//Function to check whether the triangle is rightangled triangle
{
double h=Math.sqrt(Math.pow(side2,2)+Math.pow(side3,2));
if(h==side1)
	return true;

 h=Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
if(h==side3)
	return true;

 h=Math.sqrt(Math.pow(side1,2)+Math.pow(side3,2));
if(h==side2)
	return true;

return false;

}
public boolean IsScalene()						//Function to check whether the triangle is Scalene triangle
{
	if(side1==side2||side1==side3||side2==side3)
		return false;
	else
		return true;
}
public boolean IsIsosceles()				//Function to check whether the triangle is Isosceles triangle
{
	if(side1==side2 && side1!=side3 || side2==side3 && side2!=side1)
		return true;
	else
		return false;
}

public boolean IsEquilateral()				//Function to check whether the triangle is	Equilateral triangle
{
	return (side1==side2)&&(side2==side3);
}



}
