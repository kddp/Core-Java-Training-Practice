public class SolutionTest
{
	public  int[] generateFibSeries(int limit)
	{
		int a[] = new int[limit];
		a[0]=0;
		a[1]=1;
		for(int i=1;i<limit-1;i++)
			a[i+1]=a[i]+a[i-1];
			return a;
	}

	public static void main (String args[])
	{
	SolutionTest n = new SolutionTest();
	n.generateFibSeries(5);
	System.out.println();

	}
}