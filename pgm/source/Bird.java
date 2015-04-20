public class Bird extends Animal
{
	//String name;
	public Bird(String n)
	{
		super(n);
		name=n;
	}
	public void eat()
	{
		System.out.println("I am a bird with name "+name+" eating ....");

	}
	public void sleep()
	{
		System.out.println("I am a bird with name "+name+" sleeping....");

	}

}