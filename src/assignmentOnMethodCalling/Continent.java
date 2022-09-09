package assignmentOnMethodCalling;
//method calling in different class with different argument
public class Continent {
	public static void continentName(String c)
	{
		System.out.println("India belongs to Continent :"+c);
	}
	public void continentPopulation(long d)
	{
		System.out.println("Asias Poulation is :"+d);
	}
	public static void main(String args[])
	{	
		System.out.println("This is from Class Country: ");
		Country obj = new Country();
		Country.countryName("India");
		obj.countryPoulation(1393409038L);
		
		System.out.println(" ");
		
		System.out.println("This is from Class Continent: ");
		Continent obj1 = new Continent();
		Continent.continentName("Asia");
		obj1.continentPopulation(4716773431L);
	}
}
