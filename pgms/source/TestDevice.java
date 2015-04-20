public class TestDevice
{
	public static void main( String[] args)
	{
		//Device d1 = new Device();
		Microwave d2 = new Microwave();
		d2.doSomething();
		d2.name="LG";
		Electrician e1 = new Electrician();
		e1.testDevice(d2);



		/*System.out.println("");

		Microwave d2 = new Microwave();
		d2.name="LG";
		d2.doSomething();

		System.out.println("");

		Tv t = new Tv();
		t.name="Sony";
		t.doSomething();

		System.out.println("");

		Printer d3 = new Printer();
		d3.name = "Canon";
		d3.doSomething();

*/







	}



}