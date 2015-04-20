public class TestString
{
	public static void main(String[] args)
	{
		String s1 = StringOperation.swapFirstToLast("abcd");
		System.out.println(s1);

		String s2 = StringOperation.swapFirstToLast("a");
		System.out.println(s2);

		String s3 = StringOperation.swapFirstToLast("   abcdefgh123    ");
		System.out.println(s3);

		String s4 = StringOperation.swapFirstToLast();
		System.out.println(s4);

	}
}