import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;


public class IOTest 
{

	public static void main(String[] args)
	{
		
		BufferedInputStream br = null;
		BufferedOutputStream bw = null;
				
		int a;
		try
		{
			br =  new BufferedInputStream( new FileInputStream("C:/1.txt"));
			bw =  new BufferedOutputStream( new FileOutputStream("C:/2.txt"));
			
			while( (a = br.read()) != -1)
				{
					System.out.print((char)a);
					bw.write(a);
				
				}	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			try
			{
				if(br !=null)
					br.close();
				if(bw !=null)
					bw.close();
		
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}

	}

}
