public class Roots
{
	public static void main(String[] args)
	{
		int num=Integer.parseInt(args[0]);
		int no=Integer.parseInt(args[1]);

		double x=Math.sqrt(num);
		System.out.println("Square root of the "+num+" is "+x);

		System.out.println("\n");

		double y=Math.cbrt(no);
		System.out.println("Cube root of the "+no+" is "+y);

		System.out.println("\n");

		double z=Math.pow(num,no);
		System.out.println(num+" ^ "+no+" is "+z);

	}
}