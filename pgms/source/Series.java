public class Series
{
	public boolean checkSeries(int []num)
	{
		for(int i=0;i<num.length;i++)
		{
			if(num[i]+1==num[i+1] && num[i+1]+1==num[i+2])
			return true;
		}
	}
	return false;

}