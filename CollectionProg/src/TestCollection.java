import java.util.*;

public class TestCollection 
{

	public static void main(String[] args) 
	{
		String s1 = "Dhoom3";
		String s2 = "Aashique";
		String s3 = "Ramleela";
		String s4 = "TheLift";
		String s5 = new String("TheLift");
		
		ArrayList al = new ArrayList();

		al.add("Aashique2");
		al.add("Aaksar");
		
		System.out.println("adding "+s1+" to collection => "+al.add(s1));
		System.out.println("adding "+s2+" to collection => "+al.add(s2));
		System.out.println("adding "+s3+" to collection =>"+al.add(s3));
		System.out.println("adding "+s4+" to collection => "+al.add(s4));
		System.out.println("adding "+s4+" to collection =>"+al.add(s4));
		
		System.out.println(al);
		
		for (Object o:al)
		{
			if(o instanceof String)
			{
				String s = (String)o;
				if(s.contains("Aa"))
					System.out.println("Movies name starting with Aa in collection are => "+s);
			}
		}
		
		

	}

}
