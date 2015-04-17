import java.util.Scanner;


public class TestPrime 
{

	public static void main(String[] args)
	{
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Please enter the Number => ");
		int num = sc2.nextInt();
		
		
		System.out.println(primeTest(num));
	}
	public static boolean primeTest(int num)
	{
		for(int i = 2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
}
