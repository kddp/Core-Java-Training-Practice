public class Occurance
{
	public static void main(String[] args)
	{
		System.out.println("No of occurance = "+checkOccur("abcdebcfbcfrbc","ae"));
	}

	public static int checkOccur(String s, String sub)
	{
		int count=0;
		int index=0;
		index = s.indexOf(sub,index);
		if(index!=-1)
		{
			while(index!=-1)
			{
				index = s.indexOf(sub,index+1);
				count++;
			}

		}
		return count;
	}
}