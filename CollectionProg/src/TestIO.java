import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class TestIO 
{

	public static void main(String[] args)
	{
		FileReader f1 = null;
		FileWriter f2 = null;
		int c;
		try
		{
			f1 = new FileReader("C:/1.txt");
			f2 = new FileWriter("C:/2.txt");
			while((c=f1.read())!=-1)
			{
				System.out.println((byte)c);
				f2.write(c);
			}		
		}
		
		catch(IOException e)
		{
			e.printStackTrace();
		}
			
		finally
		{
			try
			{
				if(f1!= null)
			
				f1.close();
			
			if (f2!=null)
				f2.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();		
			}
		}
	}

}
