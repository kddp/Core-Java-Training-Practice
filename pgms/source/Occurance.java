public class Occurance
{
	public static int twoOccurance(String s1,String s2)
	{
		int pos = 0;
		int i=0;
		while(i!=-1)
		{
			i = s1.indexOf(s2,pos);
			pos = i ;//+ s2.length() - 1;

		}
		return i;
	}
}