public class StringOperation
{
	public static  String swapFirstToLast(String s)
	{
		String s1=s.trim();
		if(s1.length()<=1)
			return s1;

		if(s1=="")
			return s1;

		String result = s1.charAt(s1.length()-1)+s1.substring(1,(s1.length()-1))+s1.charAt(0);
		return result;

	}
}