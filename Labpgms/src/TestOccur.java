import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class TestOccur {

	public static void main(String[] args)
	{
	
		String str;
		String chk;
		
		Scanner sc1 = new Scanner (System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the sentence ");
		str = sc1.nextLine();
		
		List col = new ArrayList();
		
		System.out.println("Enter word to check ");
		chk = sc2.next();
		
		String [] a = str.split(" ");
		
		for(String ss : a)
		{
			col.add(ss);
			
		}
		int num = Collections.frequency(col, chk);
		System.out.println(num);
		

	}

}
