public class TestCar
{
	public static void main(String[] args)
	{
		Car c1= new Car();
		c1.name="nano";
		c1.fuelQty=10;
		c1.start();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();
		c1.drive();

		System.out.println("\n");

		Car c2= new Car();
		c2.name="tata";
		c2.fuelQty=15;
		c2.start();
		c2.drive();
		c2.drive();
		c2.drive();
		c2.drive();
		c2.addFuel(5);

		Car c3= new Car();
		c3.name="indigo";
		c3.fuelQty=15;
		//c2.start();
		c2.drive();






	}
}