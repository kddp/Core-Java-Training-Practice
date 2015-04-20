public class Fabnoci
{
	public int[] series(int num)
	{
		int a[] = new int[num];
		a[0]=0;
		a[1]=1;
		for(int i=1;i<num-1;i++)
		a[i+1]=a[i]+a[i-1];
		return a;
	}

}