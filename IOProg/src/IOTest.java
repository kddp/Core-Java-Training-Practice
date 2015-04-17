import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IOTest
{
	public static void main(String [] args)
	{
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the source file path => ");
		String inPath = sc1.nextLine();
		
		String ss;
		BufferedReader br =null;
		
		Map<String,Integer> words = new HashMap<String,Integer>();
		
		try
		{
			br = new BufferedReader(new FileReader(inPath));
			while((ss=br.readLine())!=null)
			{
				String [] word = ss.split(" ");
				for(String s : word)
				{
					if(words.containsKey(s))
					{
						int val = (int)words.get(s);
						val++;
						words.put(s,val);		
					}
					else
					{
						words.put(s,1);
					}	
				}			
			}		
			System.out.println(words);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(br!=null)
					br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}					
		}

	}
}