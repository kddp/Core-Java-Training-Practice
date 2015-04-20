public class TestArray
{
	public static void main(String[] args)
	{
		/*Printing elements from cmmnd line
		for (int i=0;i<args.length;i++)
		System.out.println("");

		System.out.println(args[i]);

		System.out.println(""); */

		//Printing each character from cmmnd line
		int countUpper=0;
		int countLower=0;
		int countDigit=0;
		int countVowels=0;
		int countLetter=0;

		String s= args[0];
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			System.out.println("Character at position "+i+" is "+c);

			if (Character.isDigit(c))
			countDigit++;

			if(Character.isLetter(c))
			countLetter++;

			if(Character.isUpperCase(c))
			countUpper++;

			if(Character.isLowerCase(c))
			countLower++;

			if(c=='a' ||c=='A' ||c=='e' ||c=='E' ||c=='i'|| c=='I' ||c=='o' ||c=='O' ||c=='u' ||c== 'U')
			countVowels++;
		}
			System.out.println("");
			System.out.println("Length of tha array = "+s.length());
			System.out.println("No of Vowels = "+countVowels);
			System.out.println("No of Upper Case = "+countUpper);
			System.out.println("No of Lower Case = "+countLower);
			System.out.println("No of Digit = "+countDigit);
			System.out.println("No of Letters = "+countLetter);

			String rev="";

			{
				for(int i=s.length()-1;i>=0;i--)
				rev = rev + (s.charAt(i));
				System.out.println("String in reverse order = "+rev);
			}

	}
}