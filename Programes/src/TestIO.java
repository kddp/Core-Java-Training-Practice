import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class TestIO {

	
	public static void main(String [] args)
	{
		String from;
		String to;
		//method calling....
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the source path => ");
		from = sc.next();
		
		System.out.println("Enter the destination path => ");
		to = sc.next();
		
		copyPaste(from,to);
	}
	//method to copy paste from location....
	public static  void copyPaste(String from, String to)
	{
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		String str;
		try
		{
			
			br = new BufferedReader(new FileReader(from));
			bw = new BufferedWriter(new FileWriter(to,true));
			
			while((str = br.readLine())!=null)
			{
				System.out.println(str);
				bw.write(str);
				bw.newLine();
				
			}
			
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				if(br != null)
					br.close();
				if(bw != null)
					bw.close();
			}
			
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}