import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;


public class TestMenu {

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		int ch=0;
		String name;
		
		Set<String> col  = new LinkedHashSet<String>(); 
		
		while(ch!=5)
		{
			System.out.println("Press 1 to add in contacts : ");
			System.out.println("Press 2 to remove from contacts : ");
			System.out.println("Press 3 to show all contacts : ");
			System.out.println("Press 4 to check the name present in contact : ");
			System.out.println("Press 5 to exit : ");
	
			while(!s1.hasNextInt())
			{
				System.out.println("Please enter number only");
				s1.next();
			}
			
			ch = s1.nextInt();
				
			switch(ch)
			{
				case 1:
					System.out.println("inside 1 ");
					System.out.println("Please enter the name ");
					name = s1.next();
					System.out.println("Adding name "+name+" into the collection "+col.add(name));
					
					
						break;
				case 2 :
					System.out.println("inside 2");
						break;
				case 3 :
					System.out.println("inside 3");
					System.out.println(col);
						break;
				case 4 :
					System.out.println("inside 4");
						break;
				case 5 :
					System.out.println("See you tata bye bye !!!!!!!");
						break;
			
				default :
					System.out.println("Please enter number between 1 and 5");
						break;
			
			
			
			}
		
		
		
		}

	}

}
