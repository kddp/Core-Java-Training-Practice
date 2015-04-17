import java.util.*;

public class RemoveAllOccurances {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Please enter the string =>");
		String str =sc1.nextLine();
		
		System.out.println(str);
		String [] s = str.split(" ");
		
		System.out.println("Please Enter the word to remove =>");
		String str1 = sc1.next();
		
		System.out.println(str1);
		
		Collection<String> col = new LinkedHashSet<String>();
		
		for(String ss : s)
		
			col.add(ss);
			System.out.println(col);
		
			while(col.remove(str1))
			System.out.println("remove => "+str1);
		
			System.out.println(col);
		
		

	}

}
