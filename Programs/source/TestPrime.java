public class TestPrime
{
	public static void main(String[] args)
	{
		int num=50;//Integer.parseInt(args[0]);
		for(int i=1;i<num;i++)
		{
			boolean isPrime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
			System.out.print(" "+i+" ");
		}
	}
}