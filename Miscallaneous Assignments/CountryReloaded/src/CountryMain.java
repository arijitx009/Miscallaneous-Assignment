import java.util.Scanner;
public class CountryMain {
	
	public static void main(String args[])
	{
		int nofCountries;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of countries");
		nofCountries=sc.nextInt();
		
		Country  c[]=new Country[nofCountries];
		
		System.out.println("Enter the country information:\nCountry \nPopulation \nArea");
		for(int i=0;i<nofCountries;i++)
		{
			System.out.println("Country"+(i+1));
			c[i]=new Country(sc.next(),sc.nextInt(),sc.nextDouble());
		}
		double maximum=c[0].area;
		int index=0;
		
			for(int i=0;i<nofCountries;i++)
			{
				
				if(maximum<c[i].area)
				{
					maximum=c[i].area;
					index=i;
				}
			}
			System.out.println("The country with the largest area is" +c[index].name + "and the area is" +maximum);
		
			 maximum=c[0].population;
			index=0;
			
				for(int i=0;i<nofCountries;i++)
				{
					
					if(maximum<c[i].population)
					{
						maximum=c[i].population;
						index=i;
					}
				}
				System.out.println("The country with the largest area is" +c[index].name + "and the population is" +maximum);
			
				 maximum=c[0].population/c[0].area;
				 index=0;
				
					for(int i=0;i<nofCountries;i++)
					{
						
						if(maximum<(c[i].population/c[i].area))
						{
							maximum=(c[i].population/c[i].area);
							index=i;
						}
					}
					System.out.println("The country with the largest population density is"  +c[index].name +  "and the density is"  +maximum);
				
				
			
	}

}
