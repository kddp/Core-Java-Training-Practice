public  class Duck extends Bird
{
	String name;
	public Duck(String n)
	{
		super(n);
		name=n;

	}
	public void swim()
	{
		System.out.println("I am a Duck with name "+name+" swimming.....");

	}
	public void eat()
	{
		super.eat();
	}
	public void sleep()
	{
		super.sleep();
	}

}