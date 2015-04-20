public class TestAnimal
{
	public static void main(String[] args)
	{
		Animal a = new Animal("Jaanwar");
		a.eat();
		a.sleep();

		System.out.println("");

		Bird b = new Bird("birddy");
		b.eat();
		b.sleep();

		System.out.println("");

		Duck d = new Duck("dukky");
		d.eat();
		d.sleep();
		d.swim();




	}
}