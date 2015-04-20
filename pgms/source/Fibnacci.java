public class Fibnacci
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int [] a= new int[num];
		a[0]=0;
		a[1]=1;
		for(int i=1;i<a.length-1;i++)
		{
			a[i+1]=a[i]+a[i-1];
			System.out.print(" "+a[i]+" ");
		}


	}

}