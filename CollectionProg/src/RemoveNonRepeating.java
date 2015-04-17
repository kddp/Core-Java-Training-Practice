import java.util.*;


public class RemoveNonRepeating {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.println("Please provide the string =>");
		String s = sc1.nextLine();
		
		System.out.println("Enter the string to count => ");
		String s2 = sc2.next();
		
		String [] sr = s.split(" ");
		
		Collection col = new LinkedList();
		
		for(String s1 : sr)
		{
			col.add(s1);
		}
		int num = Collections.frequency(col, s2);
		
		System.out.println(num);

	}

}
