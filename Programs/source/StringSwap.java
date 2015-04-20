 public class StringSwap
{
	public static void main(String[] args)
	{

	String s1="ABHISHEK";
	String s2="NAG";

	String s3=s1.concat(s2);

	String s4=s3.substring(0,7);

	String s5=s3.substring(8,11);



	System.out.println("The Concatinated value of both String is= "+s3);
	System.out.println(s5);
	System.out.println(s4);

	}
}