public class Animal
{
	String name;
	public Animal(String n)
	{
		//System.out.println("inside animal arg constructor");
		name=n;
	}


	public void eat()
	{
		System.out.println("I am an Animal with name "+name+" eating munch munch....");
	}
	public void sleep()
	{
		System.out.println("I am an Animal with name "+name+" sleeping zzz zzz....");
	}

}