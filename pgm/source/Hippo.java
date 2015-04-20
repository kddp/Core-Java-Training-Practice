public class Hippo extends Animal
{
	String name;
	public Hippo(String n)
	{
		super(n);
	//	System.out.println("inside Hippo  arg constructor");
		name=n;

	}
	public void eat()
	{
		System.out.println("I am a Hippo with name "+name+" eating grass....");
		super.eat();
	}

}