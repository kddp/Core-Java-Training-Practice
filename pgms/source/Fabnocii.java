public class Fabnocii
{
	public static void main(String[] args)
	{
		int num =Integer.parseInt(args[0]);
		int a [] = new int[num];
		System.out.println(a[0]=0);
		System.out.println(a[1]=1);
		for(int i=0;i<num-1;i++)
		{
			a[i+1] = a[i]+a[i-1];
			System.out.println(a[i]);
		}
	}
}