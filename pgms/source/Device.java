public class Device
{
	String name;
	public void doSomething()
	{
		System.out.println("I am device with name "+name+" doing something...");

	}

	public Device(String n)
	{
		//System.out.println("Using const with String as parameter");
		name=n;
	}

	public Device()
	{
		//System.out.println("Using const with empty parameter");
	}
}