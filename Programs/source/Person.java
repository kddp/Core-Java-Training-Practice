public class Person
{
	int age;
	String name;
	int n;
	public void sleep()
	{
		if(age<40 && age>0)
		System.out.println("Person with name "+name+" and age "+age+" sleeping 8 hours");
		else
		System.out.println("Person with name "+name+" and age "+age+" sleeping 5 hours");
	}

	public  void dance()
	{

		if (age>50)
			System.out.println("I am a person with name "+name+" and age "+age+" doing Stand dance...");
		if(age>10 && age<35)
			System.out.println("I am a person with name "+name+" and age "+age+" doing Waltzz dance....");
		if(age<10)
			System.out.println("Please provide proper age of the person "+name);
	}

	public void eat(Food f)
	{
		System.out.println("I am person with name "+name+" eating "+f.name+" with taste "+f.taste);


	}

}