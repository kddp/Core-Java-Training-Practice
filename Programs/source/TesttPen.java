public class TesttPen
{
	public static void main(String[] args)
	{
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		p1.inkQ = 3;
		p2.inkQ = 1;
		p1.inkC = "bluey";
		p2.inkC = "reddy";
		
		p1.write("howdaa?");
		p2.write("howdu!");
		p1.write("hanga?");
		System.out.println("inkQ of p1 = "+p1.inkQ);
		p2.write("hange");
		System.out.println("inkQ of p2 = "+p2.inkQ);
	
	}

}
