
public class Test
{
	public static void main(String[] args)
	{
		
		BingoThread t1 = new BingoThread();
		Thread t = new Thread(t1);
		t.start();
		
		for(int i=1;i<=100;i++)
			System.out.println("Bongo"+i);

	}

}
