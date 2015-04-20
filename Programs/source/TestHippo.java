public class TestHippo
{
	public static void main(String[] args)
	{
		Hippo h1=new Hippo();
		Hippo h2=new Hippo();
		Hippo h3=new Hippo();

		h1.name= new String("Hippy");
		h2.name=new String("Sippy");
		h3.name=new String("Dippy");

		h1.age=5;
		h2.age=10;
		h3.age=15;

		h1.dance();
		h2.dance();
		h3.dance();

		System.out.println("Age of Hippo 1 "+h1.age);
		System.out.println("Age of Hippo 2 "+h2.age);
		System.out.println("Age of Hippo 3 "+h3.age);

		System.out.println("Name of Hippo 1 "+h1.name);
		System.out.println("Name of Hippo 2 "+h2.name);
		System.out.println("Name of Hippo 3 "+h3.name);

	}
}