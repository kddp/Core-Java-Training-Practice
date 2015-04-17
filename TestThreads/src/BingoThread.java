
public class BingoThread implements Runnable
{
	public void run() 
	{
		for (int i = 1; i <= 100 ; i++) 
		{
			System.out.println("Bingo"+i);
		}
	}
}
