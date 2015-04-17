import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class OccurInFile 
{
	public static void main(String[] args) 
	{

		Scanner sc1 = new Scanner(System.in);
		String str;
		String word;
		int count=0;
		
		System.out.println("Enter the source path of the file => ");
		String inPath = sc1.nextLine();
		System.out.println("Enter the word to count => ");
		word = sc1.next();
			
		File f = new File(inPath);
		
		System.out.println("The given file exists => "+f.exists());
		System.out.println("Absolute path of the file is => "+f.getAbsolutePath());
		System.out.println("Name of the file is => "+f.getName());
		System.out.println("Size of the file is => "+f.length());
		
		BufferedReader br = null; 
		try
		{
			br = new BufferedReader(new FileReader(inPath));
			while((str=br.readLine())!=null)
			{
				String [] ss = str.split(" ");
				for (String s : ss)
					{
					if(s.contains(word))
						count++;					
					}
			}
			System.out.println("The given word "+word+" occurs "+count+" times in given file");
		}
		catch(IOException e)
		{
			
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
