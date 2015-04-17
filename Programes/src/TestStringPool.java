
public class TestStringPool 
{

	public static void main(String[] args)
	{
		String s1 = new String("abcdef");
		String s2 = "abcdef";
		System.out.println(s1.equals(s2));
	}
}