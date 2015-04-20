public class MathOpp
{
	public static void main(String[] args)
	{
		String s = args[0];
		int len = s.length();
		System.out.println(len);


		char c=' ';
		int countVowels=0;
		int countLetter=0;
		int countNumber=0;
		int countUpper=0;
		int countLower=0;

		for (int i=0;i<len-1;i++)
		{
			c=s.charAt(i);
			System.out.println(c);



			if(Character.isLetter(c))
				countLetter++;

			if(Character.isDigit(c))
				countNumber++;

			if(Character.isUpperCase(c))
				countUpper++;

			if(Character.isLowerCase(c))
				countLower++;

			if(c=='a' || c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='s'||c=='S')
				countVowels++;
		}
			System.out.println("No of vowels= "+countVowels);
			System.out.println("No of letter= "+countLetter);
			System.out.println("No of digit= "+countNumber);
			System.out.println("No of uppercase= "+countUpper);
			System.out.println("No of lowercase= "+countLower);



	}
}