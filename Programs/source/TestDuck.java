public class TestDuck
{
	public static void main(String[]args)
	{
		Duck d1= new Duck();
		Duck d2= new Duck();
		d1.size=10;
		d2.size=20;
		d1.swim();
		d2.swim();
		System.out.println(d1.size);
		System.out.println(d2.size);
	}


}