public class TestWrapper
{
	public static void main(String[] args)
	{
	/*for(int i=0;i<args.length;i++)
	System.out.println("Value of array at position "+i+" = "+args[i]);
*/
	/*int countLetter=0;

	String s = args[0];
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);

		if(Character.isDigit(c))
		countLetter++;

	}
	System.out.println("No of letters= "+countLetter);
*/


	String s=args[0];
	String rev="";
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=(rev+ s.charAt(i));
	}
		System.out.println("Reverse String is="+rev);
	}
}