public class Pen
{
	int inkQ;
	String inkC;
	public void write(String n)
	{
		if (inkQ==0)
		{
			System.out.println("Pen doesnot have ink");
		}
		else
		{
			System.out.println("Pen with colour "+inkC+" writes "+n);
			inkQ--;
		}
		System.out.println("Ink Qunatity of the pen="+inkQ);
		}
}