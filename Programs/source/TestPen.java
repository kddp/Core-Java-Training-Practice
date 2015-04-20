public class TestPen
{
	public static void main(String[] args)
	{
		Pen p1=new Pen();

		p1.inkQ=2;
		p1.inkC="Red";
		p1.write("Reddy");
		p1.write("Reddy");
		p1.write("Reddy");



		Pen p2=new Pen();
		p2.inkQ=16;
		p2.inkC="Blue";
		p2.write("Blueyy");


		Pen p3=new Pen();
		p3.inkQ=13;
		p3.inkC="Black";
		p3.write("Blackky");


		p1.write("Reddy");


	}
}