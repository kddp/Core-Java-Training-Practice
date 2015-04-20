public class Palidrome
{
	public static void main(String[] args)
	{
		String s= args[0];
		for(int i=0;i<s.length();i++)
		{
			char c= s.charAt(i);
			System.out.println("Charater at position "+i+" is "+c);
		}
		System.out.println("");

		String rev="";
		for (int i=s.length()-1;i>=0;i--)
		rev= rev + s.charAt(i);
		System.out.println("Reversing the given string "+rev);

		System.out.println("");

		System.out.println("Checking of the palidrome");
		if(s.equals(rev))
		{
			System.out.println("The given string "+s+" is a palidrome");
		}
		else
		{
			System.out.println("The given string is not a palidrome");
		}
	}
}