public class TestPrime
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		for(int i=1;i<num+10;i++)
		{
			boolean isPrime = true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				if(num ==i)
					System.out.println("is prime");
				else
					System.out.println("not prime");
		}
	}

}