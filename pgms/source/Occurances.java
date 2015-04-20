public class Occurances
{
	public static void main(String[] args)
	{
		System.out.println(noOfOccur("abcdabfeabcdab","ab"));
	}
	public static int noOfOccur(String main,String sub)
	{
		int index=0;
		int count=0;
		index=main.indexOf(sub);
		if(index!=-1)
		{
			while(index!=-1)
			{
				index  = main.indexOf(sub,index+sub.length()-1);
				count++;
			}
		}
		return count;
	}
}