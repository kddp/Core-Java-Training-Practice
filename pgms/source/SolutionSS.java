public class SolutionSS
{
	public String stringBits(String str)
	{
		String temp="";
		for(int i =0;i<str.length();i=i+2)
		{
		char c=str.charAt(i);
		temp=temp+c;
		}
		return temp;
  	}

	public static void main (String[] args)
	{
		SolutionSS s = new SolutionSS();
		System.out.println(s.stringBits("Hello"));
	}
}
