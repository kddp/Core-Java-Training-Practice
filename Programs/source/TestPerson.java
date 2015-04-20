public class TestPerson
{
	public static void main(String[] args)
	{
		Person p = new Person();
		Food f1 = new Food();
		f1.name="idlii";
		f1.taste="yummy";
		p.name="Abhi";
		p.age=25;
		p.dance();
		p.eat(f1);
		p.sleep();

		System.out.println("");

		Person p1 = new Person();
		Food f2=new Food();
		f2.name="dosa";
		f2.taste="superr";
		p1.name="raja";
		p1.age=55;
		p1.dance();
		p1.sleep();
		p1.eat(f2);

	}
}