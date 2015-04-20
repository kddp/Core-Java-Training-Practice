public class SolutionS
{
	public boolean haveThree(int[] nums)
	{
		int count=0;
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==3 && nums[i+1]==3)
			return false;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==3)
			count++;
		}
			if(count==3)
				return true;
			else
				return false;

	}

	public static void main(String[] args)
	{
		SolutionS s = new SolutionS();
		System.out.println(s.haveThree({3,1,3,1,3}));

	}