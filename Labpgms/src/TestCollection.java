import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection 
{

	public static void main(String[] args) 
	{
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		StringLengthComp slc = new StringLengthComp();
		List namesList = new LinkedList();
		
		int ch = 0;
		String name;
		
		while(ch!=6)
		{
			System.out.println("");
			System.out.println("Enter 1 to add name to the list ");
			System.out.println("Enter 2 to search the given name ");
			System.out.println("Enter 3 to remove the given name ");
			System.out.println("Enter 4 to display the list ");
			System.out.println("Enter 5 to sort the given list ");
			System.out.println("Enter 6 to exit ");
			
			while(!sc1.hasNextInt())
			{
				System.out.println("Enter valid int input");
				sc1.next();
			}
					
			ch = sc1.nextInt();
			
			switch(ch)
			{
			
			case 1:
				
				System.out.println("Enter the name to add : ");
				name = sc1.next();
				System.out.println("Adding name "+name+" to the list");
				namesList.add(name);
					break;	
				
			case 2:
				
					System.out.println("Enter the name to search");
					name=sc1.next();
					System.out.println("The given name "+name+" : "+namesList.contains(name));		
						break;
				
			case 3:
					System.out.println("Enter the name to remove from list ");
					name = sc1.next();
					System.out.println("Given name "+name+" is removed from the list "+namesList.remove(name));
					System.out.println("Name List after removing name "+namesList);
						break;
				
			case 4:
					System.out.println("Names in the list are "+namesList);		
						break;
				
			case 5:
					System.out.println("Inside sort name");
					
					System.out.println("List after sorting "+namesList);
					break;
				
			case 6:
					System.out.println("See you again!!!!!!");
					break;
			
			default:
					System.out.println("Enter no between 1 to 6");
					break;
			}
			
			
		}
		
	}

}
