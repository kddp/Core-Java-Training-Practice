import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class TestMaps {
	public static void main( String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		Map m = new HashMap();
		String name;
		int no;
		System.out.println("Enter the name =>");
		name = sc1.next();
		System.out.println("Enter the Roll no =>");
		no = sc1.nextInt();
		
		m.put(no, name);
		System.out.println("Data stored in Collection =>" +m);
		System.out.println("Name => "+m.get(no));
		System.out.println("All Roll nos => "+m.keySet());
		System.out.println("All names => "+m.values());
		
	}

}
