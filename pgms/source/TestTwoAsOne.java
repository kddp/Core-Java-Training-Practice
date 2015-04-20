public class TestTwoAsOne
{
	public boolean twoAsOne(int a, int b, int c)
	{
		if(a+b==c || b+c==a || a+c==b)
		{
		return true;
		}
	return false;
	}

	public static void main (String args[])
	{
		TestTwoAsOne t = new TestTwoAsOne();
		System.out.println(t.twoAsOne(1,3,5));
	}
}