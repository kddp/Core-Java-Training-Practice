public class TestEqual
{
	public static void main(String[] args)
	{
		String s1 = new String("abcdef");
		String s2 = new String("abcdef");
		String s3 = "abcdef";
		String s4 = "abcdef";


		Animal a1 = new Animal("abc",5);
		Animal a2 = new Animal(null,6);

		System.out.println("a1==a2 -> "+(a1==a2));
		System.out.println("a1.equals(a2) -> "+a1.equals(a2));
/*
		System.out.println("s1==s2-> "+(s1==s2));
		System.out.println("s1.equals(s2)-> "+s1.equals(s2));

		System.out.println("\n");

		System.out.println("s1==s3-> "+(s1==s3));
		System.out.println("s1.equals(s3)-> "+s1.equals(s3));

		System.out.println("\n");

		System.out.println("s3==s4-> "+(s3==s4));
		System.out.println("s3.equals(s4)-> "+s3.equals(s4));
*/
	}

}